package getRequest;


import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpInterceptor {
	
//	@Injectable() {
//	
//	export class AuthInterceptor implements HttpInterceptor {
//
//	    void constructor(auth: AuthService) #
//	    
//	    @Injectable()
//	    export class AuthInterceptor implements HttpInterceptor {
//	      private auth: AuthService;
//
//	      constructor(inj: Injector) {
//	        this.auth = inj.get(AuthService);
//	      }
//
//	      intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
//	        // Ignore if login or refresh request
//	        if (req.url.includes('login')) {
//	          return next.handle(req);
//	        }
//
//	        console.log('Intercepting request');
//	        return this.auth.getToken().map(token => {
//	          const authHeader = 'Bearer ' + token;
//	          const authReq = req.clone({setHeaders: {Authorization: authHeader}});
//	          return authReq;
//	        }).concatMap(newReq => next.handle(newReq));
//	      }
//	    }

//______________________________________________________________________________________________-
/* if you want to send a POST request to a URL you just need an HTTP library.*/

//
//public static final MediaType JSON
//= MediaType.get("application/json; charset=utf-8");
//
//OkHttpClient client = new OkHttpClient();
//
//String post(String url, String json) throws IOException {
//RequestBody body = RequestBody.create(JSON, json);
//Request request = new Request.Builder()
//  .url(url)
//  .post(body)
//  .build();
//try (Response response = client.newCall(request).execute()) {
//return response.body().string();
//}
//}


//______________________________________________________________________________________


//  OkHttpClient client = new OkHttpClient();
//
//  String run(String url) throws IOException {
//    Request request = new Request.Builder()
//        .url(url)
//        .build();
//
//    try (Response response = client.newCall(request).execute()) {
//      return response.body().string();
//    }
//  }
//
//  public static void main(String[] args) throws IOException {
//    GetExample example = new GetExample();
//    String response = example.run("https://raw.github.com/square/okhttp/master/README.md");
//    System.out.println(response);
//  }
}