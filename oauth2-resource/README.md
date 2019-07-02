http://tutorials.jenkov.com/oauth2/client-types.html


step 1 : run the oauth2-db
step 2: got to postman
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

step 3: run the oauthw-resource application
step 4: goto postman
    http://localhost:8080/services/profile2

    In header tab

    Authorization        bearer f6f450b4-8177-4f51-8aa2-a0120c81d822

