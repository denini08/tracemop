// Copyright (c) 2002-2014 JavaMOP Team. All Rights Reserved.
package javamop.parser.ast.visitor;

import java.util.ArrayList;
import java.util.List;

import javamop.parser.ast.aspectj.CombinedPointCut;
import javamop.parser.ast.aspectj.EndObjectPointCut;
import javamop.parser.ast.aspectj.PointCut;

public class RemoveEndObjectVisitor extends BasePointCutVisitor{

	public PointCut visit(EndObjectPointCut p, Integer arg){
		if(arg == 0){
			return null;
		} else {
			List<PointCut> pointcuts = new ArrayList<PointCut>();
			return new CombinedPointCut(getBeginLine(p), getBeginColumn(p), "&&", pointcuts);
		}
	}

}
