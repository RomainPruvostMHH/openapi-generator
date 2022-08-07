/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import com.google.gson.reflect.TypeToken;
import java.time.OffsetDateTime;
import org.openapitools.client.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.swagger.annotations.*;

import java.lang.reflect.Type;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.openapitools.client.JSON;
import static io.restassured.http.Method.*;

@Api(value = "User")
public class UserApi {

    private Supplier<RequestSpecBuilder> reqSpecSupplier;
    private Consumer<RequestSpecBuilder> reqSpecCustomizer;

    private UserApi(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        this.reqSpecSupplier = reqSpecSupplier;
    }

    public static UserApi user(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        return new UserApi(reqSpecSupplier);
    }

    private RequestSpecBuilder createReqSpec() {
        RequestSpecBuilder reqSpec = reqSpecSupplier.get();
        if(reqSpecCustomizer != null) {
            reqSpecCustomizer.accept(reqSpec);
        }
        return reqSpec;
    }

    public List<Oper> getAllOperations() {
        return Arrays.asList(
                createUser(),
                createUsersWithArrayInput(),
                createUsersWithListInput(),
                deleteUser(),
                getUserByName(),
                loginUser(),
                logoutUser(),
                updateUser()
        );
    }

    @ApiOperation(value = "Create user",
            notes = "This can only be done by the logged in user.",
            nickname = "createUser",
            tags = { "user" })
    @ApiResponses(value = { 
            @ApiResponse(code = 0, message = "successful operation")  })
    public CreateUserOper createUser() {
        return new CreateUserOper(createReqSpec());
    }

    @ApiOperation(value = "Creates list of users with given input array",
            notes = "",
            nickname = "createUsersWithArrayInput",
            tags = { "user" })
    @ApiResponses(value = { 
            @ApiResponse(code = 0, message = "successful operation")  })
    public CreateUsersWithArrayInputOper createUsersWithArrayInput() {
        return new CreateUsersWithArrayInputOper(createReqSpec());
    }

    @ApiOperation(value = "Creates list of users with given input array",
            notes = "",
            nickname = "createUsersWithListInput",
            tags = { "user" })
    @ApiResponses(value = { 
            @ApiResponse(code = 0, message = "successful operation")  })
    public CreateUsersWithListInputOper createUsersWithListInput() {
        return new CreateUsersWithListInputOper(createReqSpec());
    }

    @ApiOperation(value = "Delete user",
            notes = "This can only be done by the logged in user.",
            nickname = "deleteUser",
            tags = { "user" })
    @ApiResponses(value = { 
            @ApiResponse(code = 400, message = "Invalid username supplied") ,
            @ApiResponse(code = 404, message = "User not found")  })
    public DeleteUserOper deleteUser() {
        return new DeleteUserOper(createReqSpec());
    }

    @ApiOperation(value = "Get user by user name",
            notes = "",
            nickname = "getUserByName",
            tags = { "user" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "successful operation") ,
            @ApiResponse(code = 400, message = "Invalid username supplied") ,
            @ApiResponse(code = 404, message = "User not found")  })
    public GetUserByNameOper getUserByName() {
        return new GetUserByNameOper(createReqSpec());
    }

    @ApiOperation(value = "Logs user into the system",
            notes = "",
            nickname = "loginUser",
            tags = { "user" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "successful operation") ,
            @ApiResponse(code = 400, message = "Invalid username/password supplied")  })
    public LoginUserOper loginUser() {
        return new LoginUserOper(createReqSpec());
    }

    @ApiOperation(value = "Logs out current logged in user session",
            notes = "",
            nickname = "logoutUser",
            tags = { "user" })
    @ApiResponses(value = { 
            @ApiResponse(code = 0, message = "successful operation")  })
    public LogoutUserOper logoutUser() {
        return new LogoutUserOper(createReqSpec());
    }

    @ApiOperation(value = "Updated user",
            notes = "This can only be done by the logged in user.",
            nickname = "updateUser",
            tags = { "user" })
    @ApiResponses(value = { 
            @ApiResponse(code = 400, message = "Invalid user supplied") ,
            @ApiResponse(code = 404, message = "User not found")  })
    public UpdateUserOper updateUser() {
        return new UpdateUserOper(createReqSpec());
    }

    /**
     * Customize request specification
     * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
     * @return api
     */
    public UserApi reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
        this.reqSpecCustomizer = reqSpecCustomizer;
        return this;
    }

    /**
     * Create user
     * This can only be done by the logged in user.
     *
     * @see #body Created user object (required)
     */
    public static class CreateUserOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/user";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public CreateUserOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("*/*");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /user
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

         /**
         * @param body (User) Created user object (required)
         * @return operation
         */
        public CreateUserOper body(User body) {
            reqSpec.setBody(body);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public CreateUserOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public CreateUserOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Creates list of users with given input array
     * 
     *
     * @see #body List of user object (required)
     */
    public static class CreateUsersWithArrayInputOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/user/createWithArray";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public CreateUsersWithArrayInputOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("*/*");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /user/createWithArray
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

         /**
         * @param body (List&lt;User&gt;) List of user object (required)
         * @return operation
         */
        public CreateUsersWithArrayInputOper body(List<User> body) {
            reqSpec.setBody(body);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public CreateUsersWithArrayInputOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public CreateUsersWithArrayInputOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Creates list of users with given input array
     * 
     *
     * @see #body List of user object (required)
     */
    public static class CreateUsersWithListInputOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/user/createWithList";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public CreateUsersWithListInputOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("*/*");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /user/createWithList
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

         /**
         * @param body (List&lt;User&gt;) List of user object (required)
         * @return operation
         */
        public CreateUsersWithListInputOper body(List<User> body) {
            reqSpec.setBody(body);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public CreateUsersWithListInputOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public CreateUsersWithListInputOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Delete user
     * This can only be done by the logged in user.
     *
     * @see #usernamePath The name that needs to be deleted (required)
     */
    public static class DeleteUserOper implements Oper {

        public static final Method REQ_METHOD = DELETE;
        public static final String REQ_URI = "/user/{username}";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public DeleteUserOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * DELETE /user/{username}
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        public static final String USERNAME_PATH = "username";

        /**
         * @param username (String) The name that needs to be deleted (required)
         * @return operation
         */
        public DeleteUserOper usernamePath(Object username) {
            reqSpec.addPathParam(USERNAME_PATH, username);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public DeleteUserOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public DeleteUserOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Get user by user name
     * 
     *
     * @see #usernamePath The name that needs to be fetched. Use user1 for testing. (required)
     * return User
     */
    public static class GetUserByNameOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/user/{username}";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetUserByNameOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /user/{username}
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /user/{username}
         * @param handler handler
         * @return User
         */
        public User executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<User>(){}.getType();
            return execute(handler).as(type);
        }

        public static final String USERNAME_PATH = "username";

        /**
         * @param username (String) The name that needs to be fetched. Use user1 for testing. (required)
         * @return operation
         */
        public GetUserByNameOper usernamePath(Object username) {
            reqSpec.addPathParam(USERNAME_PATH, username);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetUserByNameOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetUserByNameOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Logs user into the system
     * 
     *
     * @see #usernameQuery The user name for login (required)
     * @see #passwordQuery The password for login in clear text (required)
     * return String
     */
    public static class LoginUserOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/user/login";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public LoginUserOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /user/login
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /user/login
         * @param handler handler
         * @return String
         */
        public String executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<String>(){}.getType();
            return execute(handler).as(type);
        }

        public static final String USERNAME_QUERY = "username";

        /**
         * @param username (String) The user name for login (required)
         * @return operation
         */
        public LoginUserOper usernameQuery(Object... username) {
            reqSpec.addQueryParam(USERNAME_QUERY, username);
            return this;
        }

        public static final String PASSWORD_QUERY = "password";

        /**
         * @param password (String) The password for login in clear text (required)
         * @return operation
         */
        public LoginUserOper passwordQuery(Object... password) {
            reqSpec.addQueryParam(PASSWORD_QUERY, password);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public LoginUserOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public LoginUserOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Logs out current logged in user session
     * 
     *
     */
    public static class LogoutUserOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/user/logout";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public LogoutUserOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /user/logout
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public LogoutUserOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public LogoutUserOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Updated user
     * This can only be done by the logged in user.
     *
     * @see #usernamePath name that need to be deleted (required)
     * @see #body Updated user object (required)
     */
    public static class UpdateUserOper implements Oper {

        public static final Method REQ_METHOD = PUT;
        public static final String REQ_URI = "/user/{username}";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public UpdateUserOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("*/*");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * PUT /user/{username}
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

         /**
         * @param body (User) Updated user object (required)
         * @return operation
         */
        public UpdateUserOper body(User body) {
            reqSpec.setBody(body);
            return this;
        }

        public static final String USERNAME_PATH = "username";

        /**
         * @param username (String) name that need to be deleted (required)
         * @return operation
         */
        public UpdateUserOper usernamePath(Object username) {
            reqSpec.addPathParam(USERNAME_PATH, username);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public UpdateUserOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public UpdateUserOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
}
