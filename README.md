## The diploma project name "FinalSurge"
### Training project on UI testing automation in Java language with selenide. Testing of [site](https://log.finalsurge.com/login.cshtml) website using following **structural patterns**:
    1. Page Object 
    2. Fluent/Chain of invocations
    3. Value Object
    4. Builder
    5. Steps

### and using following technologies:
    1. Maven
    2. TestNG
    3. Selenide
    4. Allure Reporting
    5. CircleCI
    6. Log4J
    7. Lombok
    8. Listeners

###Test suite
#### Test case 1 - Filling of the login form with valid date
| Step # | Desc | Test data | Expected result |
| --- | --- | --- | --- |
|--- | Login Page | --- | --- |
| 1 | Enter email | valid email | success |
| 2 | Enter password | valid password | success |
| 3 | Click login button |  | open dashboard page |


#### Test case 2 - Authentication with empty password

| Step # | Desc | Test data | Expected result |
| --- | --- | --- | --- |
| --- | Login Page |  --- | --- |
| 1 | Enter email | valid email | success |
| 2 | Enter password | empty | - |
| 3 | Click login button |  | Message: "Please enter a password." |

#### Test case 3 - Authentication with empty email

| Step # | Desc | Test data | Expected result |
| --- | --- | --- | --- |
| --- | Login Page |  --- | --- |
| 1 | Enter email | empty | - |
| 2 | Enter password | valid password | success |
| 3 | Click login button |  | Message: "Please enter your e-mail address." |


#### Test case 4 - Authentication with empty email and with empty password

| Step # | Desc | Test data | Expected result |
| --- | --- | --- | --- |
| --- | Login Page |  --- | --- |
| 1 | Enter email | empty | - |
| 2 | Enter password | empty | - |
| 3 | Click login button |  | Message: "Please enter a password." and Message: "Please enter your e-mail address." |

#### Test case 5 - Authentication with invalid password

| Step # | Desc | Test data | Expected result |
| --- | --- | --- | --- |
| --- | Login Page |  --- | --- |
| 1 | Enter email | valid email | - |
| 2 | Enter password | invalid password | success |
| 3 | Click login button |  | Message: "Invalid login credentials. Please try again." |

#### Test case 6 - Authentication with invalid email

| Step # | Desc | Test data | Expected result |
| --- | --- | --- | --- |
| --- | Login Page |  --- | --- |
| 1 | Enter email | invalid email | - |
| 2 | Enter password | valid password | success |
| 3 | Click login button |  | Message: "Please enter a valid email address." |

#### Test case 7 - Authentication with invalid email and with invalid password

| Step # | Desc | Test data | Expected result |
| --- | --- | --- | --- |
| --- | Login Page |  --- | --- |
| 1 | Enter email | invalid email | - |
| 2 | Enter password | invalid password | success |
| 3 | Click login button |  | Message: "Please enter a valid email address." |

#### Test case 8 - Authentication with invalid email with script

| Step # | Desc | Test data | Expected result |
| --- | --- | --- | --- |
| --- | Login Page |  --- | --- |
| 1 | Enter email | script | - |
| 2 | Enter password | valid password | success |
| 3 | Click login button |  | Message: "Please enter a valid email address." |

#### Test case 9 - Authentication with invalid email with html tag

| Step # | Desc | Test data | Expected result |
| --- | --- | --- | --- |
| --- | Login Page |  --- | --- |
| 1 | Enter email | html tags | - |
| 2 | Enter password | valid password | success |
| 3 | Click login button |  | Message: "Please enter a valid email address." |

#### Test case 10 - Authentication with invalid email with different symbols

| Step # | Desc | Test data | Expected result |
| --- | --- | --- | --- |
| --- | Login Page |  --- | --- |
| 1 | Enter email | different symbols | - |
| 2 | Enter password | valid password | success |
| 3 | Click login button |  | Message: "Please enter a valid email address." |

#### Test case 11 - Authentication with invalid email with several whitespaces

| Step # | Desc | Test data | Expected result |
| --- | --- | --- | --- |
| --- | Login Page |  --- | --- |
| 1 | Enter email | several whitespaces | - |
| 2 | Enter password | valid password | success |
| 3 | Click login button |  | Message: "Please enter your e-mail address." |

#### Test case 12 - Authentication with at first whitespaces and correct email then

| Step # | Desc | Test data | Expected result |
| --- | --- | --- | --- |
| --- | Login Page |  --- | --- |
| 1 | Enter email | several whitespaces + valid email  | - |
| 2 | Enter password | valid password | success |
| 3 | Click login button |  | Message: "Please enter a valid email address." |

#### Test case 13 - Authentication with at first correct email and several whitespaces then

| Step # | Desc | Test data | Expected result |
| --- | --- | --- | --- |
| --- | Login Page |  --- | --- |
| 1 | Enter email | valid email + several whitespaces | - |
| 2 | Enter password | valid password | success |
| 3 | Click login button |  | Message: "Please enter a valid email address." |

#### Test case 14 - Authentication with a password with different case letters

| Step # | Desc | Test data | Expected result |
| --- | --- | --- | --- |
| --- | Login Page |  --- | --- |
| 1 | Enter email | valid email | success |
| 2 | Enter password | different case letters | - |
| 3 | Click login button |  | Message: "Invalid login credentials. Please try again." |


#### Test case 15 - Executing of the logout

| Step # | Desc | Test data | Expected result |
| --- | --- | --- | --- |
| --- | Login Page |  --- | --- |
| 1 | Enter all date | valid authentication | success |
| --- | Dashboard Page |  --- | --- |
| 1 | Click logout button | - | open login form |

#### Test case 16 - Clicking on the forgot button

| Step # | Desc | Test data | Expected result |
| --- | --- | --- | --- |
| --- | Login Page |  --- | --- |
| 1 | Click forgot button | - | open form to enter new button |
| 2 | Enter valid email | valid email | - |
| 3 | Click request new password button | - | received new password on the email |

#### Test case 17 - Creating on the run workout form

| Step # | Desc | Test data | Expected result |
| --- | --- | --- | --- |
| --- | Login Page |  --- | --- |
| 1 | Enter all date | valid authentication | success |
| --- | Dashboard Page |  --- | --- |
| 1 | Click calendar icon | - | open the calendar |
| --- | Calendar Page |  --- | --- |
| 1 | Click on full add button | - | open add workout |
| --- | Run Form |  --- | --- |
| 1 | Click on run menu button | - | open add new workout form |
| 2 | Select date | - | - |
| 3 | Select time of day | - | - |
| 4 | Select workout name | - | - |
| 5 | Enter workout description | - | - |
| 6 | Click show planned distance checkbox | - | open input form |
| 7 | Select planned distance input | - | - |
| 8 | Select planned distance dropdown | - | - |
| 9 | Enter planned duration | - | - |
| 10 | Enter distance input basic | - | - |
| 11 | Select distance type basic | - | - |
| 12 | Enter duration basic | - | - |
| 13 | Enter pace input basic | - | - |
| 14 | Select pace type basic | - | - |
| 15 | Click advanced work button | - | open input form |
| 16 | Enter reps input | - | - |
| 17 | Enter distance input | - | - |
| 18 | Select distance type | - | - |
| 19 | Enter advanced duration | - | - |
| 20 | Click add another set plus | - | open second form with input form |
| 21 | Click mark as race checkbox| - | open input form |
| 22 | Enter overall place | - | - |
| 23 | Enter age group place | - | - |
| 24 | Select how i felt | - | - |
| 25 | Enter perceived effort | - | - |
| 26 | Enter minHR | - | - |
| 27 | Enter avgHR | - | - |
| 28 | Enter maxHR | - | - |
| 29 | Enter calories burned | - | - |
| 30 | Click add workout button | - | creating run form |

#### Test case 18 - Calculating workout form

| Step # | Desc | Test data | Expected result |
| --- | --- | --- | --- |
| --- | Login Page |  --- | --- |
| 1 | Enter all date | valid authentication | success |
| --- | Dashboard Page |  --- | --- |
| 1 | Click workout calculators icon | - | open workout calculators frame |
| --- | Workout Calculators Form |  --- | --- |
| --- | Intensity |  --- | --- |
| 1 | Select event  | - | - |
| 2 | Enter time event hours | - | - |
| 3 | Enter time event minutes | - | - |
| 4 | Enter time event second | - | - |
| 5 | Click calculate paces button | - | calculating Intensity form|
| --- | Hansons |  --- | --- |
| 1 | Enter distance input | - | - |
| 2 | Select distance type | - | - |
| 3 | Enter time event hours | - | - |
| 4 | Enter time event minutes | - | - |
| 5 | Enter time event second | - | - |
| 6 | Click calculate paces button | - | calculating Hansons form|
| --- | McMillan recent race time |  --- | --- |
| 1 | Select distance | - | - |
| 2 | Enter time event hours | - | - |
| 3 | Enter time event minutes | - | - |
| 4 | Enter time event second | - | - |
| --- | McMillan goal race time |  --- | --- |
| 1 | Select distance | - | - |
| 2 | Enter time event hours | - | - |
| 3 | Enter time event minutes | - | - |
| 4 | Enter time event second | - | - |
| 5 | Click calculate my paces button | - | calculating McMillan form|
| --- | Tinman |  --- | --- |
| 1 | Select distance | - | - |
| 2 | Enter time event hours | - | - |
| 3 | Enter time event minutes | - | - |
| 4 | Enter time event second | - | - |
| 5 | Select gender | - | - |
| 6 | Click calculate paces button | - | calculating Tinman form|

#### Test case 19 - Checking of the work of the context menu

| Step # | Desc | Test data | Expected result |
| --- | --- | --- | --- |
| --- | Login Page |  --- | --- |
| 1 | Enter all date | valid authentication | success |
| --- | Calendar Page (context menu) |  --- | --- |
| --- | view |  --- | --- |
| 1 | Click view | - | open view form in the new window |
| --- | update workout |  --- | --- |
| 1 | Click update workout| - | open update workout |
| 2 | Enter update record in the Workout Name input| - | - |
| 3 | Enter update workout button | - | save changes |
| --- | comments |  --- | --- |
| 1 | Click comments | - | open comments form |
| 2 | Enter comments | - | - |
| 3 | Enter add comments | - | save changes |
| --- | upload data |  --- | --- |
| 1 | Click upload data | - | open upload data form |
| 2 | Select invalid file | - | success |
| 3 | Enter upload file | - | Message: "*You must select a valid .TCX or .FIT file to upload." |
| 4 | Select empty file | - | - |
| 5 | Enter upload file | - | Message: "This field is required." |
| --- | Pain Injury RunWorkout (headache dot) |  --- | --- |
| 1 | Click Pain Injury RunWorkout | - | open Pain Injury RunWorkout form |
| 2 | Click headache dot | - | open headache input |
| 3 | Click PainLevel | - | - |
| 4 | Click PainDuration | - | - |
| 5 | Click PainTrend | - | - |
| 6 | Enter pain notes | - | - |
| 7 | Click add button | - | save Injury RunWorkout for headache |
| --- | move |  --- | --- |
| 1 | Move Race on the other date | - | success |
| --- | copy |  --- | --- |
| 1 | Click copy | - | Open workout quick copy form |
| 2 | Enter changes in the form | - | - |
| 3 | Enter copy workout button | - | save changes |
| --- | delete |  --- | --- |
| 1 | Click delete | - | open approved message |
| 2 | Click ok button | - | The race is deleted |
| --- | print |  --- | --- |
| 1 | Click print | - | open workout details on the new tab |

#### Test case 20 - Viewing report & statistics

| Step # | Desc | Test data | Expected result |
| --- | --- | --- | --- |
| --- | Login Page |  --- | --- |
| 1 | Enter all date | valid authentication | success |
| --- | Dashboard Page |  --- | --- |
| 1 | Click view report & statistics link | - | open report filters form |
| --- | Report & Statistics Page |  --- | --- |
| 1 | Enter start date | - | - |
| 2 | Enter end date | - | - |
| 3 | Select activity type | - | - |
| 4 | Select report view | - | - |
| 5 | Click view report button| - | show athlete workout report |

#### Test case 21 - Printing workouts

| Step # | Desc | Test data | Expected result |
| --- | --- | --- | --- |
| --- | Login Page |  --- | --- |
| 1 | Enter all date | valid authentication | success |
| --- | Dashboard Page |  --- | --- |
| 1 | Click print workouts link | - | open print form |
| 2 | Enter print starting day | - | - |
| 3 | Enter print ending day | - | - |
| 4 | Enter print workouts button | - | open print form on the new tab |

#### Test case 22 - Viewing of the training volume

| Step # | Desc | Test data | Expected result |
| --- | --- | --- | --- |
| --- | Login Page |  --- | --- |
| 1 | Enter all date | valid authentication | success |
| --- | Dashboard Page |  --- | --- |
| 1 | Select workout for period | This Week | Show duration by activity |
| 2 | Click distance button | - | Show distance by activity |
