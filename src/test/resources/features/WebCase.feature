@KloiaCase
Feature: bootcamp tests

  Background:BG
    * I navigate to bestbuy.com
    * Country select to United States
    * I close pop-up


  Scenario: TaskOne
    * Verify title Best Buy | Official Online Store | Shop Now & Save
    * Window Maximize
    * I search to Drone
    * Listed products is verify

  Scenario:TaskTwo
    * Window Maximize
    * I click Account button
    * I click Sign In button in Top Menu
    * I fill e-mail address beyazgulsamil@gmail.com
    * I fill password beyazgul741
    * Show password in sign page
    * I click Sign In
    * Verify to successful sign text


  Scenario:TaskThree
    * Window Maximize
    * I click Account button
    * I click Sign In button in Top Menu
    * I click Sign in with Google
    * Switch use window
    * I fill gmail hyeni4444
    * I click forward id button
    * Fill password gmail yenihesap
    * I click forward pass button
    * Switch use window
    * Create new tab
    * I navigate to bestbuy.com
    * Verify to successful sign text

  Scenario: TaskFour
    * Window Maximize
    * I click Menu Button
    * I select in menu product type Audio
    * I select in menu product type Headphones
    * I select product type inside type Wireless Headphones
    * I click Show more brands
    * I select to panel in Philips
    * I click to show results
    * I select rank to 2 product
    * I click SAVE button
    * I click Saved Items button
    * Verify saved list

