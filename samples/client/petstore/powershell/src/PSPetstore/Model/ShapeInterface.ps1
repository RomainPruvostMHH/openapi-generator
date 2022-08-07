#
# OpenAPI Petstore
# This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: "" \
# Version: 1.0.0
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

No description available.

.PARAMETER ShapeType
No description available.
.OUTPUTS

ShapeInterface<PSCustomObject>
#>

function Initialize-PSShapeInterface {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ShapeType}
    )

    Process {
        'Creating PSCustomObject: PSPetstore => PSShapeInterface' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $ShapeType) {
            throw "invalid value for 'ShapeType', 'ShapeType' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "shapeType" = ${ShapeType}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to ShapeInterface<PSCustomObject>

.DESCRIPTION

Convert from JSON to ShapeInterface<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

ShapeInterface<PSCustomObject>
#>
function ConvertFrom-PSJsonToShapeInterface {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSPetstore => PSShapeInterface' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in PSShapeInterface
        $AllProperties = ("shapeType")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'shapeType' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "shapeType"))) {
            throw "Error! JSON cannot be serialized due to the required property 'shapeType' missing."
        } else {
            $ShapeType = $JsonParameters.PSobject.Properties["shapeType"].value
        }

        $PSO = [PSCustomObject]@{
            "shapeType" = ${ShapeType}
        }

        return $PSO
    }

}

