angular.module('app', ['ui.router'])
.config(function($stateProvider) {
  $stateProvider.state('myapp', {
    views: {
      'header': {
    	  templateUrl:'resource/templates/header.html'
      },
      'footer': {
        templateUrl:'resource/templates/footer.html'
      }
    }
  })
  .state('myapp.one', {
    views:{
    	'content@':{
    		templateUrl:'resource/templates/customer.html',
    		controller:'customer',
    		controllerAs:'customerCtrl'
    	}
    }
  })
  .state('myapp.two', {
	    views:{
	    	'content@':{
	    		templateUrl:'resource/templates/mywallet.html',
	    		controller:'mywallet',
	    		controllerAs:'mywalletCtrl'
	    	}
	    }  })
})
.run(function($state) {
  $state.go('myapp.one');
})
