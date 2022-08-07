# coding: utf-8

"""
    openapi 3.0.3 sample spec

    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501

    The version of the OpenAPI document: 0.0.1
    Generated by: https://openapi-generator.tech
"""

import unittest

import unit_test_api
from unit_test_api.model.nul_characters_in_strings import NulCharactersInStrings
from unit_test_api import configuration


class TestNulCharactersInStrings(unittest.TestCase):
    """NulCharactersInStrings unit test stubs"""
    _configuration = configuration.Configuration()

    def test_match_string_with_nul_passes(self):
        # match string with nul
        NulCharactersInStrings._from_openapi_data(
            "hello\x00there",
            _configuration=self._configuration
        )

    def test_do_not_match_string_lacking_nul_fails(self):
        # do not match string lacking nul
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            NulCharactersInStrings._from_openapi_data(
                "hellothere",
                _configuration=self._configuration
            )


if __name__ == '__main__':
    unittest.main()
