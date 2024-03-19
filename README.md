Security is an important part of building a good web application and validating user input is an important part of that process. The degree of validation might vary depending on the input and what type of data it represents; some require more of a syntactic validation, like validating size constraints and to ensure data does not contain any illegal characters, while others require more of a semantic validation. So depending on the data type a given set of validation rules are required to ensure that the data is consistent with domain rules.

You have been assigned a task to implement a validation framework in Java that validates data by using a set of programmatically configured rules. The rules should be implemented with reusability in mind.

The task is to implement validators and rules for the two types listed below. The validation engine should be generic so that it can be extended with additional rules. If time runs short, focus on implementing validation for a Swedish personal number.
Swedish Personal Number
The Swedish personal number consists of 10 or twelve digits and a hyphen. The hyphen is replaced with a plus sign the year a person turns 100. The first 6-8 digits are the person's birthday. Among the last four digits the first three are a serial number and the last digit is a checksum that can be calculated using the Luhn algorithm.

See wikipedia for Luhn algorithm: https://en.wikipedia.org/wiki/Luhn_algorithm

The requirements for validating a swedish personal number:
Requirements:
10 or 12 digits
Can include hyphen or plus sign
Calculate and validate checksum using the Luhn algorithm
Personal Name
Requirements:
Not blank
Swedish alphabetical characters including swedish å, ä and Ö

