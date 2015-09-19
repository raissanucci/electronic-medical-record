'use strict';

angular.module('electronic-medical-record-api')


.factory('PatientApi', ['Api', function(Api) {
  return {
    
    /**
     * Get the patient list
     */
    query: function(query) {
      return Api.get('/patients', null, query);
    },
    
    /**
     * Creates a new patient
     */
    post: function(entity) {
      return Api.post('/patients', entity);
    },
    
    
    lol: {
      
      /**
       * Get data about the patient
       */
      query: function(query) {
        return Api.get('/patients/lol', null, query);
      }
    },
    
    /**
     * Get data about the patient
     */
    get: function(id) {
      return Api.get('/patients', id);
    },
    
    /**
     * Updates the data about the patient
     */
    put: function(entity) {
      return Api.put('/patients', entity.id, entity);
    }
  };
}]);