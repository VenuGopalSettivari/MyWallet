var app = angular.module('app');
app.controller('mywallet', ['$scope','cardService',function($scope,cardService){
	var self = this;
	self.data={
			cardNumber:'',
			name:'',
			expDate:'',
			cvv:''
			};

	
	this.createCard = function(){
		
		self.data={
				cardNumber:self.cardNumber,
				name:self.name,
				expDate:self.expdate,
				cvv:self.cvv
				};
		console.log(self.data);

		cardService.createCard(self.data).then(
				function(data){
					console.log("success");
				},function(error){
					console.log("failure");
				});
		
	}
	
}]);

