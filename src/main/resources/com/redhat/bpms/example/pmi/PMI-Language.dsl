[when] If the applicant age is less than {age} = applicant : Applicant( age < {age} )
[then] the applicant is not approved = applicant.setApproved( false )
[when]The mortgage program is {program} = mortgage:MortgageApplication( program == {program} )