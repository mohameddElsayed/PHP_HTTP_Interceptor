//Now let’s use the HttpClient service to make a HTTP get request.
//
//import { Component, OnInit } from '@angular/core';
//import { HttpClient } from '@angular/common/http';
//import { Observable } from 'rxjs';
//import { tap } from 'rxjs/operators';
//
//@Component({
//  selector: 'app-header',
//  template: `
//    <h2>Header Example</h2>
//    <pre>{{ data | json }}</pre>
//  `
//})
//export class HeaderComponent implements OnInit {
//  data: {};
//  constructor(private httpClient: HttpClient) { }
//
//  ngOnInit() {
//    this.httpClient.get('/assets/header.json').subscribe(data => this.data = data);
//  }
//}
//____________________________________________________________________________________________________
package getRequest;

public class HttpInterceptor_Use_AnyWay {
	
	const module = angular.module('interceptorTest', []);
	 
	module.config($httpProvider => {
	  $httpProvider.interceptors.push(
	    createInterceptor.bind(null, ''),
	    createInterceptor.bind(null, '')
	  );
	});
	 
	module.run($http => {
	  $http.get('https://api.github.com')
	  .then(response =>; console.log('Response handler'));
	});
	 
	angular.bootstrap(document.documentElement, [module.name]);
	 
	function createInterceptor(id) {
	  return {
	    request(config) {
	      console.log(`Interceptor ${id}: Request`);
	      return config;
	    },
	 
	    response(response) {
	      console.log(`Interceptor ${id}: Response`);
	      return response;
	    }
	  };
	}
	 
	// Generates the following output:
	// Interceptor A: Request
	// Interceptor B: Request
	// Interceptor B: Response
	// Interceptor A: Response
	// Response handler

}
_____________________________________________________________________________________________

//Source: https://github.com/angular/angular.js/blob/3fd48742b0fecbc470c44b465ba90786bda87451/src/ng/http.js#L794-L812
var chain = [serverRequest, undefined];
var promise = $q.when(config);

//apply interceptors
forEach(reversedInterceptors, function(interceptor) {
if (interceptor.request || interceptor.requestError) {
 chain.unshift(interceptor.request, interceptor.requestError);
}
if (interceptor.response || interceptor.responseError) {
 chain.push(interceptor.response, interceptor.responseError);
}
});

while (chain.length) {
var thenFn = chain.shift();
var rejectFn = chain.shift();

promise = promise.then(thenFn, rejectFn);