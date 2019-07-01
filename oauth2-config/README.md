https://www.youtube.com/watch?v=NhY8q5B0s-s

http://localhost:8282/oauth/token

step 1: got to postman
select POST,  http://localhost:8283/oauth/token

step 2:
In Authorization tab:
Type: Basic Auth
Username: web
Password: webpass

Step 3: Headers

Step 4: Body
select form-data

grant_type  : password
username    : venkat
password    : venkat123

then we receive the token

{
    "access_token": "bc740af4-4be3-4ae3-bb4a-39b13f058a59",
    "token_type": "bearer",
    "expires_in": 43199,
    "scope": "READ WRITE"
}

***************
to test the token

step 1:
GET  http://localhost:8283/oauth/check_token?token=35e5da56-03b0-489a-ad5f-e7849903e832

step 2:

goto Authorization tab
Type: Basic Auth
Username: web
Password: webpass


submit got the following response


{
    "active": true,
    "exp": 1561852747,
    "user_name": "venkat",
    "authorities": [
        "CAN_WRITE",
        "CAN_DELETE",
        "CAN_READ"
    ],
    "client_id": "web",
    "scope": [
        "READ",
        "WRITE"
    ]
}