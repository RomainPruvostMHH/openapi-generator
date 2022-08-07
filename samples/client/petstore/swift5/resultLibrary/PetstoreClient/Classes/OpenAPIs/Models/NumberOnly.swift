//
// NumberOnly.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct NumberOnly: Codable, JSONEncodable, Hashable {

    public var justNumber: Double?

    public init(justNumber: Double? = nil) {
        self.justNumber = justNumber
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case justNumber = "JustNumber"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(justNumber, forKey: .justNumber)
    }
}

