https://www.youtube.com/watch?v=ykkrASGzG_M

https://www.browserling.com/tools/bcrypt


step 1: got to postman
select POST,  http://localhost:9191/oauth/token

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
    "access_token": "2f44a97d-3430-406e-a548-bcccdd2f5fe4",
    "token_type": "bearer",
    "refresh_token": "4142ffaf-5c5b-4a58-8063-3edf92c60f10",
    "expires_in": 3599,
    "scope": "READ WRITE"
}

***************
to test the token

step 1:
GET  http://localhost:9191/oauth/check_token?token=2f44a97d-3430-406e-a548-bcccdd2f5fe4

step 2:

goto Authorization tab
Type: Basic Auth
Username: mobile
Password: pin


submit got the following response


{
    "aud": [
        "payment",
        "inventory"
    ],
    "user_name": "venkat",
    "scope": [
        "READ",
        "WRITE"
    ],
    "active": true,
    "exp": 1561977421,
    "authorities": [
        "ROLE_admin",
        "delete_profile",
        "update_profile",
        "read_profile",
        "create_profile"
    ],
    "client_id": "mobile"
}





