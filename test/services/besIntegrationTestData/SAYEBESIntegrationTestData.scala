/*
 * Copyright 2018 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package services.besIntegrationTestData

/**
 * Created by matt on 25/01/16.
 */
trait SAYEBESIntegrationTestData {
  val sayeGrantedXML = <table:table table:name="SAYE_Granted_V3" table:style-name="ta1"><table:table-row table:style-name="ro6"><table:table-cell table:style-name="ce6" office:value-type="date" office:date-value="1908-10-19" calcext:value-type="date"><text:p>1908-10-19</text:p></table:table-cell><table:table-cell office:value-type="float" office:value="4" calcext:value-type="float"><text:p>4</text:p></table:table-cell><table:table-cell table:style-name="ce9" office:value-type="float" office:value="100.01" calcext:value-type="float"><text:p>100.01</text:p></table:table-cell><table:table-cell table:style-name="ce11" office:value-type="float" office:value="10.1434" calcext:value-type="float"><text:p>10.1434</text:p></table:table-cell><table:table-cell table:style-name="ce11" office:value-type="float" office:value="10.1431" calcext:value-type="float"><text:p>10.1431</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>yes</text:p></table:table-cell><table:table-cell table:style-name="ce12"/><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>aa123456</text:p></table:table-cell><table:table-cell table:number-columns-repeated="1016"/></table:table-row></table:table>
  val sayeGrantedXMLRow1 = <table:table-row table:style-name="ro6"><table:table-cell table:style-name="ce6" office:value-type="date" office:date-value="1908-10-19" calcext:value-type="date"><text:p>1908-10-19</text:p></table:table-cell><table:table-cell office:value-type="float" office:value="4" calcext:value-type="float"><text:p>4</text:p></table:table-cell><table:table-cell table:style-name="ce9" office:value-type="float" office:value="100.01" calcext:value-type="float"><text:p>100.01</text:p></table:table-cell><table:table-cell table:style-name="ce11" office:value-type="float" office:value="10.1434" calcext:value-type="float"><text:p>10.1434</text:p></table:table-cell><table:table-cell table:style-name="ce11" office:value-type="float" office:value="10.1431" calcext:value-type="float"><text:p>10.1431</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>yes</text:p></table:table-cell><table:table-cell table:style-name="ce12"/><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>aa123456</text:p></table:table-cell><table:table-cell table:number-columns-repeated="1016"/></table:table-row>
  val sayeGrantedExpData = List("1908-10-19","4","100.01","10.1434","10.1431","yes","","aa123456")
  val sayeRCLXML = <table:table table:name="SAYE_RCL_V3" table:style-name="ta1"><table:table-row table:style-name="ro6"><table:table-cell table:style-name="ce6" office:value-type="date" office:date-value="1908-10-19" calcext:value-type="date"><text:p>1908-10-19</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>yes</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>10.1431</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>Anthony</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>Joe</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>Jones</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>AA123456A</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>123/XZ55555555</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>no</text:p></table:table-cell><table:table-cell table:number-columns-repeated="1015"/></table:table-row></table:table>
  val sayeRCLXMLRow1 = <table:table-row table:style-name="ro6"><table:table-cell table:style-name="ce6" office:value-type="date" office:date-value="1908-10-19" calcext:value-type="date"><text:p>1908-10-19</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>yes</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>10.1431</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>Anthony</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>Joe</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>Jones</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>AA123456A</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>123/XZ55555555</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>no</text:p></table:table-cell><table:table-cell table:number-columns-repeated="1015"/></table:table-row>
  val sayeRCLExpData = List("1908-10-19","yes","10.1431","Anthony","Joe","Jones","AA123456A","123/XZ55555555","no")
  val sayeExercisedXML = <table:table table:name="SAYE_Exercised_V3" table:style-name="ta1"><table:table-row table:style-name="ro6"><table:table-cell table:style-name="ce6" office:value-type="date" office:date-value="1908-10-19" calcext:value-type="date"><text:p>1908-10-19</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>Anthony</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>Joe</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>Jones</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>AA123456A</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>123/XZ55555555</text:p></table:table-cell><table:table-cell table:style-name="ce6" office:value-type="date" office:date-value="2011-10-19" calcext:value-type="date"><text:p>2011-10-19</text:p></table:table-cell><table:table-cell table:style-name="ce9" office:value-type="float" office:value="100.01" calcext:value-type="float"><text:p>100.01</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>yes</text:p></table:table-cell><table:table-cell table:style-name="ce12" table:number-columns-repeated="2"/><table:table-cell table:style-name="ce11" office:value-type="float" office:value="10.1431" calcext:value-type="float"><text:p>10.1431</text:p></table:table-cell><table:table-cell table:style-name="ce11" office:value-type="float" office:value="10.1421" calcext:value-type="float"><text:p>10.1421</text:p></table:table-cell><table:table-cell table:style-name="ce11" office:value-type="float" office:value="10.142" calcext:value-type="float"><text:p>10.1420</text:p></table:table-cell><table:table-cell table:number-columns-repeated="2" table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>yes</text:p></table:table-cell><table:table-cell table:number-columns-repeated="1008"/></table:table-row></table:table>
  val sayeExercisedXMLRow1 = <table:table-row table:style-name="ro6"><table:table-cell table:style-name="ce6" office:value-type="date" office:date-value="1908-10-19" calcext:value-type="date"><text:p>1908-10-19</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>Anthony</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>Joe</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>Jones</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>AA123456A</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>123/XZ55555555</text:p></table:table-cell><table:table-cell table:style-name="ce6" office:value-type="date" office:date-value="2011-10-19" calcext:value-type="date"><text:p>2011-10-19</text:p></table:table-cell><table:table-cell table:style-name="ce9" office:value-type="float" office:value="100.01" calcext:value-type="float"><text:p>100.01</text:p></table:table-cell><table:table-cell table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>yes</text:p></table:table-cell><table:table-cell table:style-name="ce12" table:number-columns-repeated="2"/><table:table-cell table:style-name="ce11" office:value-type="float" office:value="10.1431" calcext:value-type="float"><text:p>10.1431</text:p></table:table-cell><table:table-cell table:style-name="ce11" office:value-type="float" office:value="10.1421" calcext:value-type="float"><text:p>10.1421</text:p></table:table-cell><table:table-cell table:style-name="ce11" office:value-type="float" office:value="10.142" calcext:value-type="float"><text:p>10.1420</text:p></table:table-cell><table:table-cell table:number-columns-repeated="2" table:style-name="ce12" office:value-type="string" calcext:value-type="string"><text:p>yes</text:p></table:table-cell><table:table-cell table:number-columns-repeated="1008"/></table:table-row>
  val sayeExercisedExpData = List("1908-10-19","Anthony","Joe","Jones","AA123456A","123/XZ55555555","2011-10-19","100.01","yes","","","10.1431","10.1421","10.1420","yes","yes")




}
