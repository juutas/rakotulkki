'use strict';

exports.inject = function (app) {
    app.controller('HomeController', exports.controller);
    return exports.controller;
};

exports.controller = function ($scope, CustomerService, SessionsService, InvoiceService) {

    $scope.listCustomers = function () {
        CustomerService.list().success(function (data) {
            $scope.customers = data;
        })
    };

    $scope.listSessions = function () {
        SessionsService.list().success(function (data) {
            $scope.sessions = data;
        })
    };

    $scope.listInvoices = function () {
        InvoiceService.list().success(function (data) {
            $scope.invoices = data;
        })
    };

    $scope.listCustomers();
    $scope.listSessions();
    $scope.listInvoices();

};
