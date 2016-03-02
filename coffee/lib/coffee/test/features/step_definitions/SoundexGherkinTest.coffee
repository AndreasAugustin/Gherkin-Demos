###*
# @copyright Copyright (c) 2016 andy
#               All rights reserved.
# @name SoundexGherkinTest
# @company none
# @licence MIT licence.
# @author andy andy.augustin@t-online.de
###

#soundex = require('Soundex')

module.exports = () ->
  "use strict"
  @.Given(/^A soundex instance$/,(callback) ->
    callback.pending())

  @.When(/^I enter a word as "([^"]*)"$/, (arg1, callback) ->
    callback.pending())

  @.Then(/^it is encoded to "([^"]*)"$/, (arg1, callback) ->
    callback.pending())


  @.When(/^I enter the word "([^"]*)"$/, (arg1) ->)

  @.Then(/^the encoded length is equal to "([^"]*)"$/, (arg1, callback) ->
    callback.pending())


  @.When(/^I enter the lower case word "([^"]*)"$/, (arg1, callback) ->
    callback.pending())

  @.Then(/^the encoded first letter is equal to "([^"]*)"$/, (arg1, callback) ->
    callback.pending())


  @.When(/^I enter the character "([^"]*)"$/, (arg1, callback) ->
    callback.pending())

  @.Then(/^it is equal to other encoded character "([^"]*)"$/, (arg1, callback) ->
    callback.pending())

  @.When(/^I enter the string "([^"]*)"$/,  (arg1, callback) ->
    callback.pending())

  @.Then(/^it is equal to other encoded string "([^"]*)"$/, (arg1, callback) ->
    callback.pending())

