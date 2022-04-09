package day10_NestedIf;

public class Http {
    public static void main(String[] args) {

        int statusCode=200;

        String result = (statusCode==200)?"OK" :(statusCode==201)?"Created":(statusCode==202)?"Accepted":(statusCode==301)?"Moved Permanently":
                (statusCode==303)?"See Other":(statusCode==201)?"Not Modified":(statusCode==201)?"Temporary Redirect":(statusCode==201)?"Bad Request":
                        (statusCode==201)?"Unauthorized":(statusCode==201)?"Forbidden":(statusCode==201)?"Not Found":(statusCode==201)?"Gone":
                                (statusCode==201)?"Internal Server Error":(statusCode==201)?"Service Unavailable": "Invalid stasus code";

        System.out.println(result);


    }
}

/*
7.  HTTP is the protocol that governs communications between web-servers and web clients. Part of the protocol
 includes a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status codes and their meanings:
	                200, OK
	                201, Created
	                202, Accepted
	                301, Moved Permanently
	                303, See Other
	                304, Not Modified
	                307, Temporary Redirect
	                400, Bad Request
	                401, Unauthorized
	                403, Forbidden
	                404, Not Found
	                410, Gone
	                500, Internal Server Error
	                503, Service Unavailable


         declare an int variable called statusCode, and a valid status code is already given
         write a program that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok

            NOTE: MUST USE TERNARY.



 */
