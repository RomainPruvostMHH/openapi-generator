# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""

import re  # noqa: F401
import sys  # noqa: F401
import typing  # noqa: F401
import functools  # noqa: F401

from frozendict import frozendict  # noqa: F401

import decimal  # noqa: F401
from datetime import date, datetime  # noqa: F401
from frozendict import frozendict  # noqa: F401

from petstore_api import schemas  # noqa: F401


class ComplexQuadrilateral(
    schemas.ComposedSchema,
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        
        
        class all_of_1(
            schemas.DictSchema
        ):
            
            
            class quadrilateralType(
                schemas.SchemaEnumMakerClsFactory(
                    enum_value_to_name={
                        "ComplexQuadrilateral": "COMPLEX_QUADRILATERAL",
                    }
                ),
                schemas.StrSchema
            ):
                
                @classmethod
                @property
                def COMPLEX_QUADRILATERAL(cls):
                    return cls("ComplexQuadrilateral")
        
        
            def __new__(
                cls,
                *args: typing.Union[dict, frozendict, ],
                quadrilateralType: typing.Union[quadrilateralType, schemas.Unset] = schemas.unset,
                _configuration: typing.Optional[schemas.Configuration] = None,
                **kwargs: typing.Type[schemas.Schema],
            ) -> 'all_of_1':
                return super().__new__(
                    cls,
                    *args,
                    quadrilateralType=quadrilateralType,
                    _configuration=_configuration,
                    **kwargs,
                )
        
        @classmethod
        @property
        @functools.cache
        def all_of(cls):
            # we need this here to make our import statements work
            # we must store _composed_schemas in here so the code is only run
            # when we invoke this method. If we kept this at the class
            # level we would get an error because the class level
            # code would be run when this module is imported, and these composed
            # classes don't exist yet because their module has not finished
            # loading
            return [
                QuadrilateralInterface,
                cls.all_of_1,
            ]

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict, str, date, datetime, int, float, decimal.Decimal, None, list, tuple, bytes],
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Type[schemas.Schema],
    ) -> 'ComplexQuadrilateral':
        return super().__new__(
            cls,
            *args,
            _configuration=_configuration,
            **kwargs,
        )

from petstore_api.model.quadrilateral_interface import QuadrilateralInterface
