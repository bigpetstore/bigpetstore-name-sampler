/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.bigtop.bigpetstore.datagenerator.generators.names;

import java.io.Serializable;

import org.apache.bigtop.bigpetstore.datagenerator.framework.pdfs.MultinomialPDF;

public class Names implements Serializable
{
	private static final long serialVersionUID = 2731634747628534453L;
	
	final MultinomialPDF<String> firstNames;
	final MultinomialPDF<String> lastNames;
	
	public Names(MultinomialPDF<String> firstNames, MultinomialPDF<String> lastNames)
	{
		this.firstNames = firstNames;
		this.lastNames = lastNames;
	}

	public MultinomialPDF<String> getFirstNames()
	{
		return firstNames;
	}

	public MultinomialPDF<String> getLastNames()
	{
		return lastNames;
	}
}
