enum Enum { 
    A
}
 
enum Enum2 { 
    A = "A",
    B = "B"
}


const enumA = Enum.A;
const nameOfEnumA = Enum[enumA];
const nameOfEnumANew = Enum[Enum.A];

console.log(enumA, nameOfEnumA, nameOfEnumANew);