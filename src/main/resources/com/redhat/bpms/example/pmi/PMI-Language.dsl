[when] If the applicant age is less than {minage} = applicant : Applicant( age < {minage} )
[when] If the applicant credit score is less than {minscore} = applicant : Applicant(creditScore < {minscore})
[then] the applicant is not approved = applicant.setApproved( false )
[when] If the mortgage program is {program} = mortgage:MortgageApplication( program == {program} )