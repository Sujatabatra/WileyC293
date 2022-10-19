var x={};
console.log(typeof x);

x=null;
console.log(typeof x);

x={'fname':'sujata',
  'lname':'batra',
  'yearsofexp':22,
  'location':'India',
  'multilingualskills':true,
  'address':{'houseNo':111,
            'StreetName':"SujataStreet",
            'City':'Delhi',
            'State':'Delhi'}
  }

console.log(x);

console.log(typeof x.address);
console.log(typeof x.multilingualskills);

// x=10;
// console.log(x);
// console.log(typeof x.address);
x.gender="female";
console.log(x);