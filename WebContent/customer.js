var app = angular.module('app');
app.controller('customer', ['$scope','customerService',function($scope,customerService){
	var self = this;
	self.data={
			customerLogIn:'',
			password:'',
			customerFirstName:'',
			customerLastName:'',
			emailAddress:''
			};
	
	this.createCustomer = function(){
		
		self.data={
				customerLogIn:self.logiIn,
				password:self.password,
				customerFirstName:self.firstName,
				customerLastName:self.lastName,
				emailAddress:self.email
				};

		console.log(self.data);

		customerService.createCustomer(self.data).then(
				function(data){
					console.log("success");
				},function(error){
					console.log("failure");
				});
		
	}
	
}]);

