var app = angular.module('app');
app.factory('customerService',customerService);

function customerService($rootScope,$http,$q){
	console.log('customerService factory');
	var customer = {};
	
	customer.createCustomer = function(data){
		console.log('2nd stage');
		console.log('customer service - create customer-'+data);
		console.log("datas----"+data.customerLogIn);
		console.log("datas----"+data.password);
		var deferred = $q.defer();
		
		$http({
			method : 'POST',
			url:'rest/customer/',
			data:data,
			headers:{
				"Content-Type":"application/json"
			}
		}).then(function successBack(response){
			console.log("SUCCESS");
		},function failureBack(response){
			console.log("FAILURE");
		});
		
		return deferred.promise;
	}
	
	return customer;
}