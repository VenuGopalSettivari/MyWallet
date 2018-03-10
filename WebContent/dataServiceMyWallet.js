var app = angular.module('app');
app.factory('cardService',cardService);

function cardService($rootScope,$http,$q){
	console.log('cardService factory');
	var card = {};
	
	card.createCard = function(data){
		console.log('2nd stage');
		console.log('card service - create card-'+data);

		var deferred = $q.defer();
		
		$http({
			method : 'POST',
			url:'rest/card/',
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
	
	return card;
}