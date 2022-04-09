package day11_Switch_Scanner;

public class Http {
    public static void main(String[] args) {

        int statusCode= 200;
        String str = "";

        switch (statusCode){
            case 200 : str="OK"; break;
            case 201 : str="Created"; break;
            case 202 : str="Accepted"; break;
            case 301 : str="Moved Permanently"; break;
            case 303 : str="See Other"; break;
            case 304 : str="Not Modified"; break;
            case 307 : str="Temporary Redirect"; break;
            case 400 : str="Bad Request"; break;
            case 401 : str="Unauthorized"; break;
            case 403 : str="Forbidden"; break;
            case 404 : str="Not Found"; break;
            case 410 : str="Gone"; break;
            case 500 : str="Internal Server Error"; break;
            case 503 : str="Service Unavailable"; break;
            default: str="Invalid status code";
        }
        System.out.println(str);


    }
}

/*
5. HTTP is the protocol that governs communications between web-servers and web clients. Part of the protocol includes
 a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status code:
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


         declare an int variable called StatusCode, write a switch that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok

 */
