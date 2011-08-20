package de.peeeq.wurstscript.ast;

import java.io.IOException;
import java.util.List;

import katja.common.KatjaList;
import katja.common.KatjaListImpl;
import katja.common.KatjaListPosImpl;
import katja.common.KatjaNodePos;
import katja.common.KatjaSort;

public interface CompilationUnitPos extends de.peeeq.wurstscript.ast.AST.ListPos<de.peeeq.wurstscript.ast.CompilationUnit, de.peeeq.wurstscript.ast.WPackagePos, de.peeeq.wurstscript.ast.WPackage> {

    //----- methods of CompilationUnitPos -----

    public de.peeeq.wurstscript.ast.CompilationUnit term();
    public de.peeeq.wurstscript.ast.CompilationUnitPos add(de.peeeq.wurstscript.ast.WPackage element);
    public de.peeeq.wurstscript.ast.CompilationUnitPos addAll(KatjaList<? extends de.peeeq.wurstscript.ast.WPackage> list);
    public de.peeeq.wurstscript.ast.CompilationUnitPos remove(de.peeeq.wurstscript.ast.WPackage element);
    public de.peeeq.wurstscript.ast.CompilationUnitPos removeAll(KatjaList<? extends de.peeeq.wurstscript.ast.WPackage> list);
    public de.peeeq.wurstscript.ast.CompilationUnitPos appBack(de.peeeq.wurstscript.ast.WPackage element);
    public de.peeeq.wurstscript.ast.CompilationUnitPos appFront(de.peeeq.wurstscript.ast.WPackage element);
    public de.peeeq.wurstscript.ast.CompilationUnitPos conc(KatjaList<? extends de.peeeq.wurstscript.ast.WPackage> list);
    public de.peeeq.wurstscript.ast.CompilationUnitPos reverse();
    public de.peeeq.wurstscript.ast.CompilationUnitPos toSet();
    public de.peeeq.wurstscript.ast.CompilationUnitPos setAdd(de.peeeq.wurstscript.ast.WPackage element);
    public de.peeeq.wurstscript.ast.CompilationUnitPos setRemove(de.peeeq.wurstscript.ast.WPackage element);
    public de.peeeq.wurstscript.ast.CompilationUnitPos setUnion(KatjaList<? extends de.peeeq.wurstscript.ast.WPackage> list);
    public de.peeeq.wurstscript.ast.CompilationUnitPos setWithout(KatjaList<? extends de.peeeq.wurstscript.ast.WPackage> list);
    public de.peeeq.wurstscript.ast.CompilationUnitPos setIntersection(KatjaList<? extends de.peeeq.wurstscript.ast.WPackage> list);
    public KatjaList<de.peeeq.wurstscript.ast.WPackagePos> toList();
    public de.peeeq.wurstscript.ast.CompilationUnitPos replace(de.peeeq.wurstscript.ast.CompilationUnit term);
    public de.peeeq.wurstscript.ast.AST.SortPos parent();
    public de.peeeq.wurstscript.ast.AST.SortPos lsib();
    public de.peeeq.wurstscript.ast.AST.SortPos rsib();
    public de.peeeq.wurstscript.ast.AST.SortPos preOrder();
    public de.peeeq.wurstscript.ast.AST.SortPos preOrderSkip();
    public de.peeeq.wurstscript.ast.AST.SortPos postOrder();
    public de.peeeq.wurstscript.ast.AST.SortPos postOrderStart();
    public de.peeeq.wurstscript.ast.AST.SortPos follow(List<Integer> path);

    //----- nested classes of CompilationUnitPos -----

    static class ListImpl extends KatjaListImpl<de.peeeq.wurstscript.ast.WPackagePos> implements KatjaList<de.peeeq.wurstscript.ast.WPackagePos> {

        //----- methods of ListImpl -----

        ListImpl(de.peeeq.wurstscript.ast.WPackagePos... elements) {
            super(elements);

            for(de.peeeq.wurstscript.ast.WPackagePos element : elements)
                if(element == null)
                    throw new IllegalArgumentException("constructor of katja list for position sort WPackagePos invoked with null element");
        }

        private ListImpl() {
        }

        protected KatjaList<de.peeeq.wurstscript.ast.WPackagePos> createInstance(de.peeeq.wurstscript.ast.WPackagePos[] elements, boolean isSet) {
            for(de.peeeq.wurstscript.ast.WPackagePos element : elements)
                if(element == null)
                    throw new IllegalArgumentException("constructor of katja list for position sort WPackagePos invoked with null element");

            ListImpl temp = new ListImpl();
            temp.values = elements;
            temp = (ListImpl) AST.unique(temp);
            if(isSet) temp.set = temp;

            return temp;
        }

        protected de.peeeq.wurstscript.ast.WPackagePos[] createArray(int size) {
            return new de.peeeq.wurstscript.ast.WPackagePos[size];
        }

        public Appendable toString(Appendable builder) throws IOException {
            boolean first = true;

            builder.append("KatjaList( ");
            for(de.peeeq.wurstscript.ast.WPackagePos element : values) {
                if(first) first = false;
                else builder.append(", ");
                element.toString(builder);
            }
            builder.append(" )");

            return builder;
        }

        public Appendable toJavaCode(Appendable builder) throws IOException {
            throw new UnsupportedOperationException("toJavaCode invoked on an anonymous list of positions, you do not want to do that");
        }

        public final String sortName() {
            return "<anonymous>";
        }
    }

    static interface VisitorType<E extends Throwable> {

        //----- methods of VisitorType<E extends Throwable> -----

        public void visit(de.peeeq.wurstscript.ast.WPackagePos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.WPosPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.StringPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.WImportsPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.WEntitiesPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.IntegerPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.WImportPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.WEntityPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.TypeDefPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.FuncDefPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.GlobalVarDefPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.InitBlockPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.NativeFuncPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.NativeTypePos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ClassDefPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.FuncSignaturePos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.WStatementsPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.BooleanPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OptTypeExprPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OptExprPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ClassSlotsPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.NoTypeExprPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.TypeExprPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.NoExprPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprBinaryPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprUnaryPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprMemberVarPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprMemberArrayVarPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprMemberMethodPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprFunctionCallPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprNewObjectPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprAtomicPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprIntValPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprRealValPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprStringValPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprBoolValPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprFuncRefPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprVarAccessPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprVarArrayAccessPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprThisPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.WParametersPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.WStatementPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ClassSlotPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ArraySizesPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpBinaryPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpUnaryPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.IndexesPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ArgumentsPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.DoublePos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.StmtIfPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.StmtWhilePos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.LocalVarDefPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.StmtSetPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.StmtCallPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.StmtReturnPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.StmtDestroyPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.StmtIncRefCountPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.StmtDecRefCountPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.StmtErrPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ConstructorDefPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OnDestroyDefPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ClassMemberPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpOrPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpAndPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpEqualsPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpUnequalsPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpLessEqPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpLessPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpGreaterEqPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpGreaterPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpPlusPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpMinusPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpMultPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpDivRealPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpModRealPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpModIntPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpDivIntPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpNotPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.WParameterPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpAssignmentPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpAssignPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.CompilationUnitPos term) throws E;
    }

    public static abstract class Visitor<E extends Throwable> implements de.peeeq.wurstscript.ast.CompilationUnitPos.VisitorType<E> {

        //----- attributes of Visitor<E extends Throwable> -----

        private final de.peeeq.wurstscript.ast.ClassMemberPos.Switch<Object, E> variantVisit$ClassMemberPos = new de.peeeq.wurstscript.ast.ClassMemberPos.Switch<Object, E>() { public final Object CaseGlobalVarDefPos(de.peeeq.wurstscript.ast.GlobalVarDefPos term) throws E { visit(term); return null; } public final Object CaseFuncDefPos(de.peeeq.wurstscript.ast.FuncDefPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.ClassSlotPos.Switch<Object, E> variantVisit$ClassSlotPos = new de.peeeq.wurstscript.ast.ClassSlotPos.Switch<Object, E>() { public final Object CaseConstructorDefPos(de.peeeq.wurstscript.ast.ConstructorDefPos term) throws E { visit(term); return null; } public final Object CaseOnDestroyDefPos(de.peeeq.wurstscript.ast.OnDestroyDefPos term) throws E { visit(term); return null; } public final Object CaseGlobalVarDefPos(de.peeeq.wurstscript.ast.GlobalVarDefPos term) throws E { visit(term); return null; } public final Object CaseFuncDefPos(de.peeeq.wurstscript.ast.FuncDefPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.ExprAtomicPos.Switch<Object, E> variantVisit$ExprAtomicPos = new de.peeeq.wurstscript.ast.ExprAtomicPos.Switch<Object, E>() { public final Object CaseExprIntValPos(de.peeeq.wurstscript.ast.ExprIntValPos term) throws E { visit(term); return null; } public final Object CaseExprRealValPos(de.peeeq.wurstscript.ast.ExprRealValPos term) throws E { visit(term); return null; } public final Object CaseExprStringValPos(de.peeeq.wurstscript.ast.ExprStringValPos term) throws E { visit(term); return null; } public final Object CaseExprBoolValPos(de.peeeq.wurstscript.ast.ExprBoolValPos term) throws E { visit(term); return null; } public final Object CaseExprFuncRefPos(de.peeeq.wurstscript.ast.ExprFuncRefPos term) throws E { visit(term); return null; } public final Object CaseExprVarAccessPos(de.peeeq.wurstscript.ast.ExprVarAccessPos term) throws E { visit(term); return null; } public final Object CaseExprVarArrayAccessPos(de.peeeq.wurstscript.ast.ExprVarArrayAccessPos term) throws E { visit(term); return null; } public final Object CaseExprThisPos(de.peeeq.wurstscript.ast.ExprThisPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.ExprPos.Switch<Object, E> variantVisit$ExprPos = new de.peeeq.wurstscript.ast.ExprPos.Switch<Object, E>() { public final Object CaseExprBinaryPos(de.peeeq.wurstscript.ast.ExprBinaryPos term) throws E { visit(term); return null; } public final Object CaseExprUnaryPos(de.peeeq.wurstscript.ast.ExprUnaryPos term) throws E { visit(term); return null; } public final Object CaseExprMemberVarPos(de.peeeq.wurstscript.ast.ExprMemberVarPos term) throws E { visit(term); return null; } public final Object CaseExprMemberArrayVarPos(de.peeeq.wurstscript.ast.ExprMemberArrayVarPos term) throws E { visit(term); return null; } public final Object CaseExprMemberMethodPos(de.peeeq.wurstscript.ast.ExprMemberMethodPos term) throws E { visit(term); return null; } public final Object CaseExprFunctionCallPos(de.peeeq.wurstscript.ast.ExprFunctionCallPos term) throws E { visit(term); return null; } public final Object CaseExprNewObjectPos(de.peeeq.wurstscript.ast.ExprNewObjectPos term) throws E { visit(term); return null; } public final Object CaseExprIntValPos(de.peeeq.wurstscript.ast.ExprIntValPos term) throws E { visit(term); return null; } public final Object CaseExprRealValPos(de.peeeq.wurstscript.ast.ExprRealValPos term) throws E { visit(term); return null; } public final Object CaseExprStringValPos(de.peeeq.wurstscript.ast.ExprStringValPos term) throws E { visit(term); return null; } public final Object CaseExprBoolValPos(de.peeeq.wurstscript.ast.ExprBoolValPos term) throws E { visit(term); return null; } public final Object CaseExprFuncRefPos(de.peeeq.wurstscript.ast.ExprFuncRefPos term) throws E { visit(term); return null; } public final Object CaseExprVarAccessPos(de.peeeq.wurstscript.ast.ExprVarAccessPos term) throws E { visit(term); return null; } public final Object CaseExprVarArrayAccessPos(de.peeeq.wurstscript.ast.ExprVarArrayAccessPos term) throws E { visit(term); return null; } public final Object CaseExprThisPos(de.peeeq.wurstscript.ast.ExprThisPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.OpAssignmentPos.Switch<Object, E> variantVisit$OpAssignmentPos = new de.peeeq.wurstscript.ast.OpAssignmentPos.Switch<Object, E>() { public final Object CaseOpAssignPos(de.peeeq.wurstscript.ast.OpAssignPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.OpBinaryPos.Switch<Object, E> variantVisit$OpBinaryPos = new de.peeeq.wurstscript.ast.OpBinaryPos.Switch<Object, E>() { public final Object CaseOpOrPos(de.peeeq.wurstscript.ast.OpOrPos term) throws E { visit(term); return null; } public final Object CaseOpAndPos(de.peeeq.wurstscript.ast.OpAndPos term) throws E { visit(term); return null; } public final Object CaseOpEqualsPos(de.peeeq.wurstscript.ast.OpEqualsPos term) throws E { visit(term); return null; } public final Object CaseOpUnequalsPos(de.peeeq.wurstscript.ast.OpUnequalsPos term) throws E { visit(term); return null; } public final Object CaseOpLessEqPos(de.peeeq.wurstscript.ast.OpLessEqPos term) throws E { visit(term); return null; } public final Object CaseOpLessPos(de.peeeq.wurstscript.ast.OpLessPos term) throws E { visit(term); return null; } public final Object CaseOpGreaterEqPos(de.peeeq.wurstscript.ast.OpGreaterEqPos term) throws E { visit(term); return null; } public final Object CaseOpGreaterPos(de.peeeq.wurstscript.ast.OpGreaterPos term) throws E { visit(term); return null; } public final Object CaseOpPlusPos(de.peeeq.wurstscript.ast.OpPlusPos term) throws E { visit(term); return null; } public final Object CaseOpMinusPos(de.peeeq.wurstscript.ast.OpMinusPos term) throws E { visit(term); return null; } public final Object CaseOpMultPos(de.peeeq.wurstscript.ast.OpMultPos term) throws E { visit(term); return null; } public final Object CaseOpDivRealPos(de.peeeq.wurstscript.ast.OpDivRealPos term) throws E { visit(term); return null; } public final Object CaseOpModRealPos(de.peeeq.wurstscript.ast.OpModRealPos term) throws E { visit(term); return null; } public final Object CaseOpModIntPos(de.peeeq.wurstscript.ast.OpModIntPos term) throws E { visit(term); return null; } public final Object CaseOpDivIntPos(de.peeeq.wurstscript.ast.OpDivIntPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.OpUnaryPos.Switch<Object, E> variantVisit$OpUnaryPos = new de.peeeq.wurstscript.ast.OpUnaryPos.Switch<Object, E>() { public final Object CaseOpNotPos(de.peeeq.wurstscript.ast.OpNotPos term) throws E { visit(term); return null; } public final Object CaseOpMinusPos(de.peeeq.wurstscript.ast.OpMinusPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.OptExprPos.Switch<Object, E> variantVisit$OptExprPos = new de.peeeq.wurstscript.ast.OptExprPos.Switch<Object, E>() { public final Object CaseNoExprPos(de.peeeq.wurstscript.ast.NoExprPos term) throws E { visit(term); return null; } public final Object CaseExprBinaryPos(de.peeeq.wurstscript.ast.ExprBinaryPos term) throws E { visit(term); return null; } public final Object CaseExprUnaryPos(de.peeeq.wurstscript.ast.ExprUnaryPos term) throws E { visit(term); return null; } public final Object CaseExprMemberVarPos(de.peeeq.wurstscript.ast.ExprMemberVarPos term) throws E { visit(term); return null; } public final Object CaseExprMemberArrayVarPos(de.peeeq.wurstscript.ast.ExprMemberArrayVarPos term) throws E { visit(term); return null; } public final Object CaseExprMemberMethodPos(de.peeeq.wurstscript.ast.ExprMemberMethodPos term) throws E { visit(term); return null; } public final Object CaseExprFunctionCallPos(de.peeeq.wurstscript.ast.ExprFunctionCallPos term) throws E { visit(term); return null; } public final Object CaseExprNewObjectPos(de.peeeq.wurstscript.ast.ExprNewObjectPos term) throws E { visit(term); return null; } public final Object CaseExprIntValPos(de.peeeq.wurstscript.ast.ExprIntValPos term) throws E { visit(term); return null; } public final Object CaseExprRealValPos(de.peeeq.wurstscript.ast.ExprRealValPos term) throws E { visit(term); return null; } public final Object CaseExprStringValPos(de.peeeq.wurstscript.ast.ExprStringValPos term) throws E { visit(term); return null; } public final Object CaseExprBoolValPos(de.peeeq.wurstscript.ast.ExprBoolValPos term) throws E { visit(term); return null; } public final Object CaseExprFuncRefPos(de.peeeq.wurstscript.ast.ExprFuncRefPos term) throws E { visit(term); return null; } public final Object CaseExprVarAccessPos(de.peeeq.wurstscript.ast.ExprVarAccessPos term) throws E { visit(term); return null; } public final Object CaseExprVarArrayAccessPos(de.peeeq.wurstscript.ast.ExprVarArrayAccessPos term) throws E { visit(term); return null; } public final Object CaseExprThisPos(de.peeeq.wurstscript.ast.ExprThisPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.OptTypeExprPos.Switch<Object, E> variantVisit$OptTypeExprPos = new de.peeeq.wurstscript.ast.OptTypeExprPos.Switch<Object, E>() { public final Object CaseNoTypeExprPos(de.peeeq.wurstscript.ast.NoTypeExprPos term) throws E { visit(term); return null; } public final Object CaseTypeExprPos(de.peeeq.wurstscript.ast.TypeExprPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.StmtCallPos.Switch<Object, E> variantVisit$StmtCallPos = new de.peeeq.wurstscript.ast.StmtCallPos.Switch<Object, E>() { public final Object CaseExprMemberMethodPos(de.peeeq.wurstscript.ast.ExprMemberMethodPos term) throws E { visit(term); return null; } public final Object CaseExprFunctionCallPos(de.peeeq.wurstscript.ast.ExprFunctionCallPos term) throws E { visit(term); return null; } public final Object CaseExprNewObjectPos(de.peeeq.wurstscript.ast.ExprNewObjectPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.TypeDefPos.Switch<Object, E> variantVisit$TypeDefPos = new de.peeeq.wurstscript.ast.TypeDefPos.Switch<Object, E>() { public final Object CaseNativeTypePos(de.peeeq.wurstscript.ast.NativeTypePos term) throws E { visit(term); return null; } public final Object CaseClassDefPos(de.peeeq.wurstscript.ast.ClassDefPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.WEntityPos.Switch<Object, E> variantVisit$WEntityPos = new de.peeeq.wurstscript.ast.WEntityPos.Switch<Object, E>() { public final Object CaseFuncDefPos(de.peeeq.wurstscript.ast.FuncDefPos term) throws E { visit(term); return null; } public final Object CaseGlobalVarDefPos(de.peeeq.wurstscript.ast.GlobalVarDefPos term) throws E { visit(term); return null; } public final Object CaseInitBlockPos(de.peeeq.wurstscript.ast.InitBlockPos term) throws E { visit(term); return null; } public final Object CaseNativeFuncPos(de.peeeq.wurstscript.ast.NativeFuncPos term) throws E { visit(term); return null; } public final Object CaseNativeTypePos(de.peeeq.wurstscript.ast.NativeTypePos term) throws E { visit(term); return null; } public final Object CaseClassDefPos(de.peeeq.wurstscript.ast.ClassDefPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.WStatementPos.Switch<Object, E> variantVisit$WStatementPos = new de.peeeq.wurstscript.ast.WStatementPos.Switch<Object, E>() { public final Object CaseStmtIfPos(de.peeeq.wurstscript.ast.StmtIfPos term) throws E { visit(term); return null; } public final Object CaseStmtWhilePos(de.peeeq.wurstscript.ast.StmtWhilePos term) throws E { visit(term); return null; } public final Object CaseLocalVarDefPos(de.peeeq.wurstscript.ast.LocalVarDefPos term) throws E { visit(term); return null; } public final Object CaseStmtSetPos(de.peeeq.wurstscript.ast.StmtSetPos term) throws E { visit(term); return null; } public final Object CaseStmtReturnPos(de.peeeq.wurstscript.ast.StmtReturnPos term) throws E { visit(term); return null; } public final Object CaseStmtDestroyPos(de.peeeq.wurstscript.ast.StmtDestroyPos term) throws E { visit(term); return null; } public final Object CaseStmtIncRefCountPos(de.peeeq.wurstscript.ast.StmtIncRefCountPos term) throws E { visit(term); return null; } public final Object CaseStmtDecRefCountPos(de.peeeq.wurstscript.ast.StmtDecRefCountPos term) throws E { visit(term); return null; } public final Object CaseStmtErrPos(de.peeeq.wurstscript.ast.StmtErrPos term) throws E { visit(term); return null; } public final Object CaseExprMemberMethodPos(de.peeeq.wurstscript.ast.ExprMemberMethodPos term) throws E { visit(term); return null; } public final Object CaseExprFunctionCallPos(de.peeeq.wurstscript.ast.ExprFunctionCallPos term) throws E { visit(term); return null; } public final Object CaseExprNewObjectPos(de.peeeq.wurstscript.ast.ExprNewObjectPos term) throws E { visit(term); return null; } };

        //----- methods of Visitor<E extends Throwable> -----

        public final void visit(de.peeeq.wurstscript.ast.ClassMemberPos term) throws E {
            term.Switch(variantVisit$ClassMemberPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.ClassSlotPos term) throws E {
            term.Switch(variantVisit$ClassSlotPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.ExprAtomicPos term) throws E {
            term.Switch(variantVisit$ExprAtomicPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.ExprPos term) throws E {
            term.Switch(variantVisit$ExprPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.OpAssignmentPos term) throws E {
            term.Switch(variantVisit$OpAssignmentPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.OpBinaryPos term) throws E {
            term.Switch(variantVisit$OpBinaryPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.OpUnaryPos term) throws E {
            term.Switch(variantVisit$OpUnaryPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.OptExprPos term) throws E {
            term.Switch(variantVisit$OptExprPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.OptTypeExprPos term) throws E {
            term.Switch(variantVisit$OptTypeExprPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.StmtCallPos term) throws E {
            term.Switch(variantVisit$StmtCallPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.TypeDefPos term) throws E {
            term.Switch(variantVisit$TypeDefPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.WEntityPos term) throws E {
            term.Switch(variantVisit$WEntityPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.WStatementPos term) throws E {
            term.Switch(variantVisit$WStatementPos);
        }
    }

    public static abstract class DefaultVisitor<E extends Throwable> extends de.peeeq.wurstscript.ast.CompilationUnitPos.Visitor<E> {

        //----- methods of DefaultVisitor<E extends Throwable> -----

        public void visit(de.peeeq.wurstscript.ast.WPackagePos term) throws E {
            visit(term.source());
            visit(term.name());
            visit(term.imports());
            visit(term.elements());
        }

        public void visit(de.peeeq.wurstscript.ast.WPosPos term) throws E {
            visit(term.file());
            visit(term.line());
            visit(term.column());
        }

        public void visit(de.peeeq.wurstscript.ast.StringPos term) throws E {
        }

        public void visit(de.peeeq.wurstscript.ast.WImportsPos term) throws E {
            for(de.peeeq.wurstscript.ast.WImportPos element : term)
                visit(element);
        }

        public void visit(de.peeeq.wurstscript.ast.WEntitiesPos term) throws E {
            for(de.peeeq.wurstscript.ast.WEntityPos element : term)
                visit(element);
        }

        public void visit(de.peeeq.wurstscript.ast.IntegerPos term) throws E {
        }

        public void visit(de.peeeq.wurstscript.ast.WImportPos term) throws E {
            visit(term.source());
            visit(term.packagename());
        }

        public void visit(de.peeeq.wurstscript.ast.FuncDefPos term) throws E {
            visit(term.source());
            visit(term.signature());
            visit(term.body());
        }

        public void visit(de.peeeq.wurstscript.ast.GlobalVarDefPos term) throws E {
            visit(term.source());
            visit(term.isConstant());
            visit(term.typ());
            visit(term.name());
            visit(term.initialExpr());
        }

        public void visit(de.peeeq.wurstscript.ast.InitBlockPos term) throws E {
            visit(term.source());
            visit(term.body());
        }

        public void visit(de.peeeq.wurstscript.ast.NativeFuncPos term) throws E {
            visit(term.source());
            visit(term.signature());
        }

        public void visit(de.peeeq.wurstscript.ast.NativeTypePos term) throws E {
            visit(term.source());
            visit(term.name());
            visit(term.typ());
        }

        public void visit(de.peeeq.wurstscript.ast.ClassDefPos term) throws E {
            visit(term.source());
            visit(term.name());
            visit(term.unmanaged());
            visit(term.slots());
        }

        public void visit(de.peeeq.wurstscript.ast.FuncSignaturePos term) throws E {
            visit(term.source());
            visit(term.name());
            visit(term.parameters());
            visit(term.typ());
        }

        public void visit(de.peeeq.wurstscript.ast.WStatementsPos term) throws E {
            for(de.peeeq.wurstscript.ast.WStatementPos element : term)
                visit(element);
        }

        public void visit(de.peeeq.wurstscript.ast.BooleanPos term) throws E {
        }

        public void visit(de.peeeq.wurstscript.ast.ClassSlotsPos term) throws E {
            for(de.peeeq.wurstscript.ast.ClassSlotPos element : term)
                visit(element);
        }

        public void visit(de.peeeq.wurstscript.ast.NoTypeExprPos term) throws E {
        }

        public void visit(de.peeeq.wurstscript.ast.TypeExprPos term) throws E {
            visit(term.source());
            visit(term.typeName());
            visit(term.isArray());
            visit(term.sizes());
        }

        public void visit(de.peeeq.wurstscript.ast.NoExprPos term) throws E {
        }

        public void visit(de.peeeq.wurstscript.ast.ExprBinaryPos term) throws E {
            visit(term.source());
            visit(term.left());
            visit(term.op());
            visit(term.right());
        }

        public void visit(de.peeeq.wurstscript.ast.ExprUnaryPos term) throws E {
            visit(term.source());
            visit(term.op());
            visit(term.right());
        }

        public void visit(de.peeeq.wurstscript.ast.ExprMemberVarPos term) throws E {
            visit(term.source());
            visit(term.left());
            visit(term.varName());
        }

        public void visit(de.peeeq.wurstscript.ast.ExprMemberArrayVarPos term) throws E {
            visit(term.source());
            visit(term.left());
            visit(term.varName());
            visit(term.indexes());
        }

        public void visit(de.peeeq.wurstscript.ast.ExprMemberMethodPos term) throws E {
            visit(term.source());
            visit(term.left());
            visit(term.funcName());
            visit(term.args());
        }

        public void visit(de.peeeq.wurstscript.ast.ExprFunctionCallPos term) throws E {
            visit(term.source());
            visit(term.funcName());
            visit(term.args());
        }

        public void visit(de.peeeq.wurstscript.ast.ExprNewObjectPos term) throws E {
            visit(term.source());
            visit(term.typeName());
            visit(term.args());
        }

        public void visit(de.peeeq.wurstscript.ast.ExprIntValPos term) throws E {
            visit(term.source());
            visit(term.val());
        }

        public void visit(de.peeeq.wurstscript.ast.ExprRealValPos term) throws E {
            visit(term.source());
            visit(term.val());
        }

        public void visit(de.peeeq.wurstscript.ast.ExprStringValPos term) throws E {
            visit(term.source());
            visit(term.val());
        }

        public void visit(de.peeeq.wurstscript.ast.ExprBoolValPos term) throws E {
            visit(term.source());
            visit(term.val());
        }

        public void visit(de.peeeq.wurstscript.ast.ExprFuncRefPos term) throws E {
            visit(term.source());
            visit(term.funcName());
        }

        public void visit(de.peeeq.wurstscript.ast.ExprVarAccessPos term) throws E {
            visit(term.source());
            visit(term.varName());
        }

        public void visit(de.peeeq.wurstscript.ast.ExprVarArrayAccessPos term) throws E {
            visit(term.source());
            visit(term.varName());
            visit(term.indexes());
        }

        public void visit(de.peeeq.wurstscript.ast.ExprThisPos term) throws E {
            visit(term.source());
        }

        public void visit(de.peeeq.wurstscript.ast.WParametersPos term) throws E {
            for(de.peeeq.wurstscript.ast.WParameterPos element : term)
                visit(element);
        }

        public void visit(de.peeeq.wurstscript.ast.ArraySizesPos term) throws E {
            for(de.peeeq.wurstscript.ast.ExprPos element : term)
                visit(element);
        }

        public void visit(de.peeeq.wurstscript.ast.IndexesPos term) throws E {
            for(de.peeeq.wurstscript.ast.ExprPos element : term)
                visit(element);
        }

        public void visit(de.peeeq.wurstscript.ast.ArgumentsPos term) throws E {
            for(de.peeeq.wurstscript.ast.ExprPos element : term)
                visit(element);
        }

        public void visit(de.peeeq.wurstscript.ast.DoublePos term) throws E {
        }

        public void visit(de.peeeq.wurstscript.ast.StmtIfPos term) throws E {
            visit(term.source());
            visit(term.cond());
            visit(term.thenBlock());
            visit(term.elseBlock());
        }

        public void visit(de.peeeq.wurstscript.ast.StmtWhilePos term) throws E {
            visit(term.source());
            visit(term.cond());
            visit(term.body());
        }

        public void visit(de.peeeq.wurstscript.ast.LocalVarDefPos term) throws E {
            visit(term.source());
            visit(term.constant());
            visit(term.typ());
            visit(term.name());
            visit(term.initialExpr());
        }

        public void visit(de.peeeq.wurstscript.ast.StmtSetPos term) throws E {
            visit(term.source());
            visit(term.left());
            visit(term.op());
            visit(term.right());
        }

        public void visit(de.peeeq.wurstscript.ast.StmtReturnPos term) throws E {
            visit(term.source());
            visit(term.obj());
        }

        public void visit(de.peeeq.wurstscript.ast.StmtDestroyPos term) throws E {
            visit(term.source());
            visit(term.obj());
        }

        public void visit(de.peeeq.wurstscript.ast.StmtIncRefCountPos term) throws E {
            visit(term.source());
            visit(term.obj());
        }

        public void visit(de.peeeq.wurstscript.ast.StmtDecRefCountPos term) throws E {
            visit(term.source());
            visit(term.obj());
        }

        public void visit(de.peeeq.wurstscript.ast.StmtErrPos term) throws E {
            visit(term.source());
        }

        public void visit(de.peeeq.wurstscript.ast.ConstructorDefPos term) throws E {
            visit(term.source());
            visit(term.params());
            visit(term.body());
        }

        public void visit(de.peeeq.wurstscript.ast.OnDestroyDefPos term) throws E {
            visit(term.source());
            visit(term.body());
        }

        public void visit(de.peeeq.wurstscript.ast.OpOrPos term) throws E {
        }

        public void visit(de.peeeq.wurstscript.ast.OpAndPos term) throws E {
        }

        public void visit(de.peeeq.wurstscript.ast.OpEqualsPos term) throws E {
        }

        public void visit(de.peeeq.wurstscript.ast.OpUnequalsPos term) throws E {
        }

        public void visit(de.peeeq.wurstscript.ast.OpLessEqPos term) throws E {
        }

        public void visit(de.peeeq.wurstscript.ast.OpLessPos term) throws E {
        }

        public void visit(de.peeeq.wurstscript.ast.OpGreaterEqPos term) throws E {
        }

        public void visit(de.peeeq.wurstscript.ast.OpGreaterPos term) throws E {
        }

        public void visit(de.peeeq.wurstscript.ast.OpPlusPos term) throws E {
        }

        public void visit(de.peeeq.wurstscript.ast.OpMinusPos term) throws E {
        }

        public void visit(de.peeeq.wurstscript.ast.OpMultPos term) throws E {
        }

        public void visit(de.peeeq.wurstscript.ast.OpDivRealPos term) throws E {
        }

        public void visit(de.peeeq.wurstscript.ast.OpModRealPos term) throws E {
        }

        public void visit(de.peeeq.wurstscript.ast.OpModIntPos term) throws E {
        }

        public void visit(de.peeeq.wurstscript.ast.OpDivIntPos term) throws E {
        }

        public void visit(de.peeeq.wurstscript.ast.OpNotPos term) throws E {
        }

        public void visit(de.peeeq.wurstscript.ast.WParameterPos term) throws E {
            visit(term.source());
            visit(term.typ());
            visit(term.name());
        }

        public void visit(de.peeeq.wurstscript.ast.OpAssignPos term) throws E {
        }

        public void visit(de.peeeq.wurstscript.ast.CompilationUnitPos term) throws E {
            for(de.peeeq.wurstscript.ast.WPackagePos element : term)
                visit(element);
        }
    }

    static class Impl extends KatjaListPosImpl<de.peeeq.wurstscript.ast.CompilationUnitPos, de.peeeq.wurstscript.ast.CompilationUnit, de.peeeq.wurstscript.ast.WPackagePos, de.peeeq.wurstscript.ast.WPackage> implements de.peeeq.wurstscript.ast.CompilationUnitPos {

        //----- methods of Impl -----

        Impl(KatjaNodePos<de.peeeq.wurstscript.ast.CompilationUnitPos, ?> parent, de.peeeq.wurstscript.ast.CompilationUnit term, int pos) {
            super(parent, term, pos);
        }

        Impl(de.peeeq.wurstscript.ast.CompilationUnit term) {
            super(term);
        }

        protected de.peeeq.wurstscript.ast.WPackagePos getElementInstance(int pos) {
            return de.peeeq.wurstscript.ast.AST.WPackagePos(this, _term.get(pos), pos);
        }

        protected de.peeeq.wurstscript.ast.WPackagePos[] createArray(int size) {
            return new de.peeeq.wurstscript.ast.WPackagePos[size];
        }

        public de.peeeq.wurstscript.ast.CompilationUnitPos add(de.peeeq.wurstscript.ast.WPackage element) {
            return replace(_term.add(element));
        }

        public de.peeeq.wurstscript.ast.CompilationUnitPos addAll(KatjaList<? extends de.peeeq.wurstscript.ast.WPackage> list) {
            return replace(_term.addAll(list));
        }

        public de.peeeq.wurstscript.ast.CompilationUnitPos remove(de.peeeq.wurstscript.ast.WPackage element) {
            return replace(_term.remove(element));
        }

        public de.peeeq.wurstscript.ast.CompilationUnitPos removeAll(KatjaList<? extends de.peeeq.wurstscript.ast.WPackage> list) {
            return replace(_term.removeAll(list));
        }

        public de.peeeq.wurstscript.ast.CompilationUnitPos appBack(de.peeeq.wurstscript.ast.WPackage element) {
            return replace(_term.appBack(element));
        }

        public de.peeeq.wurstscript.ast.CompilationUnitPos appFront(de.peeeq.wurstscript.ast.WPackage element) {
            return replace(_term.appFront(element));
        }

        public de.peeeq.wurstscript.ast.CompilationUnitPos conc(KatjaList<? extends de.peeeq.wurstscript.ast.WPackage> list) {
            return replace(_term.conc(list));
        }

        public de.peeeq.wurstscript.ast.CompilationUnitPos reverse() {
            return replace(_term.reverse());
        }

        public de.peeeq.wurstscript.ast.CompilationUnitPos toSet() {
            return replace(_term.toSet());
        }

        public de.peeeq.wurstscript.ast.CompilationUnitPos setAdd(de.peeeq.wurstscript.ast.WPackage element) {
            return replace(_term.setAdd(element));
        }

        public de.peeeq.wurstscript.ast.CompilationUnitPos setRemove(de.peeeq.wurstscript.ast.WPackage element) {
            return replace(_term.setRemove(element));
        }

        public de.peeeq.wurstscript.ast.CompilationUnitPos setUnion(KatjaList<? extends de.peeeq.wurstscript.ast.WPackage> list) {
            return replace(_term.setUnion(list));
        }

        public de.peeeq.wurstscript.ast.CompilationUnitPos setWithout(KatjaList<? extends de.peeeq.wurstscript.ast.WPackage> list) {
            return replace(_term.setWithout(list));
        }

        public de.peeeq.wurstscript.ast.CompilationUnitPos setIntersection(KatjaList<? extends de.peeeq.wurstscript.ast.WPackage> list) {
            return replace(_term.setIntersection(list));
        }

        public KatjaList<de.peeeq.wurstscript.ast.WPackagePos> toList() {
            for(int i = 0; i < size(); i++) if(values[i] == null) values[i] = getElementInstance(i);
            return new CompilationUnitPos.ListImpl(values);
        }

        public de.peeeq.wurstscript.ast.CompilationUnitPos replace(de.peeeq.wurstscript.ast.CompilationUnit term) {
            return (de.peeeq.wurstscript.ast.CompilationUnitPos) super.replace(term);
        }

        protected de.peeeq.wurstscript.ast.CompilationUnitPos freshRootPosition(KatjaSort term) {
            if(!(term instanceof de.peeeq.wurstscript.ast.CompilationUnit))
                throw new IllegalArgumentException("given term to replace root position has not the correct sort CompilationUnit");

            return AST.CompilationUnitPos((CompilationUnit) term);
        }

        public de.peeeq.wurstscript.ast.AST.SortPos parent() {
            return (de.peeeq.wurstscript.ast.AST.SortPos) super.parent();
        }

        public de.peeeq.wurstscript.ast.AST.SortPos lsib() {
            return (de.peeeq.wurstscript.ast.AST.SortPos) super.lsib();
        }

        public de.peeeq.wurstscript.ast.AST.SortPos rsib() {
            return (de.peeeq.wurstscript.ast.AST.SortPos) super.rsib();
        }

        public de.peeeq.wurstscript.ast.AST.SortPos preOrder() {
            return (de.peeeq.wurstscript.ast.AST.SortPos) super.preOrder();
        }

        public de.peeeq.wurstscript.ast.AST.SortPos preOrderSkip() {
            return (de.peeeq.wurstscript.ast.AST.SortPos) super.preOrderSkip();
        }

        public de.peeeq.wurstscript.ast.AST.SortPos postOrder() {
            return (de.peeeq.wurstscript.ast.AST.SortPos) super.postOrder();
        }

        public de.peeeq.wurstscript.ast.AST.SortPos postOrderStart() {
            return (de.peeeq.wurstscript.ast.AST.SortPos) super.postOrderStart();
        }

        public de.peeeq.wurstscript.ast.AST.SortPos follow(List<Integer> path) {
            return (de.peeeq.wurstscript.ast.AST.SortPos) super.follow(path);
        }

        public Appendable toJavaCode(Appendable builder) throws IOException {
            builder.append("AST.CompilationUnitPos");
            builder.append("( ");
            root().term().toJavaCode(builder);
            builder.append(" )");
            for(int pos : path()) builder.append(".get("+pos+")");

            return builder;
        }

        public Appendable toString(Appendable builder) throws IOException {
            term().toString(builder);
            builder.append("@CompilationUnit");
            for(int pos : path()) builder.append("."+pos);

            return builder;
        }

        public final String sortName() {
            return "CompilationUnitPos";
        }

        //----- nested classes of Impl -----

        static class ListImpl extends KatjaListImpl<de.peeeq.wurstscript.ast.WPackagePos> implements KatjaList<de.peeeq.wurstscript.ast.WPackagePos> {

            //----- methods of ListImpl -----

            ListImpl(de.peeeq.wurstscript.ast.WPackagePos... elements) {
                super(elements);

                for(de.peeeq.wurstscript.ast.WPackagePos element : elements)
                    if(element == null)
                        throw new IllegalArgumentException("constructor of katja list for position sort WPackagePos invoked with null element");
            }

            private ListImpl() {
            }

            protected KatjaList<de.peeeq.wurstscript.ast.WPackagePos> createInstance(de.peeeq.wurstscript.ast.WPackagePos[] elements, boolean isSet) {
                for(de.peeeq.wurstscript.ast.WPackagePos element : elements)
                    if(element == null)
                        throw new IllegalArgumentException("constructor of katja list for position sort WPackagePos invoked with null element");

                ListImpl temp = new ListImpl();
                temp.values = elements;
                temp = (ListImpl) AST.unique(temp);
                if(isSet) temp.set = temp;

                return temp;
            }

            protected de.peeeq.wurstscript.ast.WPackagePos[] createArray(int size) {
                return new de.peeeq.wurstscript.ast.WPackagePos[size];
            }

            public Appendable toString(Appendable builder) throws IOException {
                boolean first = true;

                builder.append("KatjaList( ");
                for(de.peeeq.wurstscript.ast.WPackagePos element : values) {
                    if(first) first = false;
                    else builder.append(", ");
                    element.toString(builder);
                }
                builder.append(" )");

                return builder;
            }

            public Appendable toJavaCode(Appendable builder) throws IOException {
                throw new UnsupportedOperationException("toJavaCode invoked on an anonymous list of positions, you do not want to do that");
            }

            public final String sortName() {
                return "<anonymous>";
            }
        }
    }
}

