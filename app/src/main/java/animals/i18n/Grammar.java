package animals.i18n;

import java.util.ListResourceBundle;

import static animals.i18n.GrammarKeys.CAN;
import static animals.i18n.GrammarKeys.CAN_NEGATIVE;
import static animals.i18n.GrammarKeys.CAN_Q;
import static animals.i18n.GrammarKeys.DEFINITE_ARTICLE;
import static animals.i18n.GrammarKeys.HAS;
import static animals.i18n.GrammarKeys.HAS_NEGATIVE;
import static animals.i18n.GrammarKeys.HAS_Q;
import static animals.i18n.GrammarKeys.HAS_UNDEFINITE;
import static animals.i18n.GrammarKeys.IS;
import static animals.i18n.GrammarKeys.IS_NEGATIVE;
import static animals.i18n.GrammarKeys.IS_Q;
import static animals.i18n.GrammarKeys.IT;
import static animals.i18n.GrammarKeys.UNDEFINITE_A;
import static animals.i18n.GrammarKeys.UNDEFINITE_AN;

public class Grammar extends ListResourceBundle {



    @Override
    protected Object[][] getContents() {
        return new Object[][] {
                {DEFINITE_ARTICLE, "the"},
                {UNDEFINITE_AN, "an"},
                {UNDEFINITE_A, "a"},
                {IT, "it"},
                {IS, "is"},
                {CAN, "can"},
                {HAS, "has"},
                {IS_NEGATIVE, "isn't"},
                {IS_Q, "Is it"},
                {HAS_NEGATIVE, "doesn't have"},
                {HAS_Q, "Does it have"},
                {CAN_NEGATIVE, "can't"},
                {CAN_Q, "Can it"},
                {HAS_UNDEFINITE, Boolean.TRUE}
        };
    }
}
