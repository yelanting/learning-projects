var Enum;
(function (Enum) {
    Enum[Enum["A"] = 0] = "A";
})(Enum || (Enum = {}));
var Enum2;
(function (Enum2) {
    Enum2["A"] = "A";
    Enum2["B"] = "B";
})(Enum2 || (Enum2 = {}));
var enumA = Enum.A;
var nameOfEnumA = Enum[enumA];
var nameOfEnumANew = Enum[Enum.A];
console.log(enumA, nameOfEnumA, nameOfEnumANew);
