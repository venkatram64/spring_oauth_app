http://localhost:8282/oauth/token

step 1: got to postman
select POST,  http://localhost:8282/oauth/token

step 2:
In Authorization tab:
Type: Basic Auth
Username: mobile
Password: pin

Step 3: Headers

Step 4: Body
select form-data

grant_type  : password
username    : venkat
password    : venkat123

then we receive the token

{
    "access_token": "4cf5783d-eb3d-4de5-ac36-a0d6ff9e1fd2",
    "token_type": "bearer",
    "refresh_token": "8c643c20-da6c-4753-b7ab-dd60debdb39f",
    "expires_in": 1492,
    "scope": "READ WRITE"
}

***************
to test the token

step 1:
GET  http://localhost:8282/oauth/check_token?token=35e5da56-03b0-489a-ad5f-e7849903e832

step 2:

goto Authorization tab
Type: Basic Auth
Username: mobile
Password: pin


submit got the following response


{
    "active": true,
    "exp": 1561801601,
    "user_name": "venkat",
    "authorities": [
        "ROLE_ADMIN",
        "ROLE_USER"
    ],
    "client_id": "mobile",
    "scope": [
        "READ",
        "WRITE"
    ]
}