package v.s;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class r5XEUfod5GSCCwq6c implements pARxL2hv3Xoc, hYMmDgRUK0a6MaJzT, EedOwBpLU616tq0s0D, qEQ5trexEd2Ykvd, CkyOmAcgdfoXSc {
    public static final Object Ee8d2j4S9Vm5yGuR = new Object();
    public static volatile r5XEUfod5GSCCwq6c JXn4Qf7zpnLjP5;
    public static volatile r5XEUfod5GSCCwq6c xDyLpEZyrcKVe0;
    public Object vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ r5XEUfod5GSCCwq6c(int i, Object obj) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = obj;
    }

    public static r5XEUfod5GSCCwq6c D5P1xCAyuvgF() {
        if (xDyLpEZyrcKVe0 == null) {
            synchronized (Ee8d2j4S9Vm5yGuR) {
                try {
                    if (xDyLpEZyrcKVe0 == null) {
                        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = new r5XEUfod5GSCCwq6c(1, false);
                        r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF = new ConcurrentHashMap();
                        xDyLpEZyrcKVe0 = r5xeufod5gsccwq6c;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c2 = xDyLpEZyrcKVe0;
        SbxdZ6Kq2uhHQ5RPRqm.ibVTtJUNfrGYbW(r5xeufod5gsccwq6c2);
        return r5xeufod5gsccwq6c2;
    }

    public static void O2DHNSIGZlgPja7eqLgn(String str) {
        if (str.startsWith("gcm.n.")) {
            str.substring(6);
        }
    }

    public static boolean XiR1pIn5878vVWd(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static void b1EoSIRjJHO5(eyije75asyarHGHdxkfX eyije75asyarhghdxkfx) {
        eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
    }

    /* JADX WARN: Type inference failed for: r7v15, types: [boolean, int] */
    public static WO16ah7oTpx6o3e3a l1V0lQr6TbwNKqHfXNbb(eyije75asyarHGHdxkfX eyije75asyarhghdxkfx) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new kqr9a6cdIajJ19jP("work_spec_id", "TEXT", true, 1, null, 1));
        map.put("prerequisite_id", new kqr9a6cdIajJ19jP("prerequisite_id", "TEXT", true, (-73) + 75, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new aiWeEbZVIIpMHm("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new aiWeEbZVIIpMHm("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new TrEY4Uc0Kd3sdQC("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new TrEY4Uc0Kd3sdQC("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        AfMRrsvrH15XfvJ2iD2 afMRrsvrH15XfvJ2iD2 = new AfMRrsvrH15XfvJ2iD2("Dependency", map, hashSet, hashSet2);
        AfMRrsvrH15XfvJ2iD2 afMRrsvrH15XfvJ2iD2DDIMxZXP1V8HdM = AfMRrsvrH15XfvJ2iD2.dDIMxZXP1V8HdM(eyije75asyarhghdxkfx, "Dependency");
        if (!afMRrsvrH15XfvJ2iD2.equals(afMRrsvrH15XfvJ2iD2DDIMxZXP1V8HdM)) {
            return new WO16ah7oTpx6o3e3a(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + afMRrsvrH15XfvJ2iD2 + "\n Found:\n" + afMRrsvrH15XfvJ2iD2DDIMxZXP1V8HdM);
        }
        HashMap map2 = new HashMap(30);
        map2.put("id", new kqr9a6cdIajJ19jP("id", "TEXT", true, 1, null, 1));
        map2.put("state", new kqr9a6cdIajJ19jP("state", "INTEGER", true, 0, null, 1));
        map2.put("worker_class_name", new kqr9a6cdIajJ19jP("worker_class_name", "TEXT", true, 0, null, 1));
        map2.put("input_merger_class_name", new kqr9a6cdIajJ19jP("input_merger_class_name", "TEXT", true, 0, null, 1));
        map2.put("input", new kqr9a6cdIajJ19jP("input", "BLOB", true, 0, null, 1));
        map2.put("output", new kqr9a6cdIajJ19jP("output", "BLOB", true, 0, null, 1));
        map2.put("initial_delay", new kqr9a6cdIajJ19jP("initial_delay", "INTEGER", true, 0, null, 1));
        map2.put("interval_duration", new kqr9a6cdIajJ19jP("interval_duration", "INTEGER", true, 0, null, 1));
        map2.put("flex_duration", new kqr9a6cdIajJ19jP("flex_duration", "INTEGER", true, 0, null, 1));
        map2.put("run_attempt_count", new kqr9a6cdIajJ19jP("run_attempt_count", "INTEGER", true, 0, null, 1));
        map2.put("backoff_policy", new kqr9a6cdIajJ19jP("backoff_policy", "INTEGER", true, 0, null, 1));
        map2.put("backoff_delay_duration", new kqr9a6cdIajJ19jP("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        map2.put("last_enqueue_time", new kqr9a6cdIajJ19jP("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        map2.put("minimum_retention_duration", new kqr9a6cdIajJ19jP("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        map2.put("schedule_requested_at", new kqr9a6cdIajJ19jP("schedule_requested_at", "INTEGER", true, 0, null, 1));
        map2.put("run_in_foreground", new kqr9a6cdIajJ19jP("run_in_foreground", "INTEGER", true, 0, null, 1));
        map2.put("out_of_quota_policy", new kqr9a6cdIajJ19jP("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        map2.put("period_count", new kqr9a6cdIajJ19jP("period_count", "INTEGER", true, 0, "0", 1));
        map2.put("generation", new kqr9a6cdIajJ19jP("generation", "INTEGER", true, 0, "0", 1));
        map2.put("next_schedule_time_override", new kqr9a6cdIajJ19jP("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        map2.put("next_schedule_time_override_generation", new kqr9a6cdIajJ19jP("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
        map2.put("stop_reason", new kqr9a6cdIajJ19jP("stop_reason", "INTEGER", true, 0, "-256", 1));
        map2.put("required_network_type", new kqr9a6cdIajJ19jP("required_network_type", "INTEGER", true, 0, null, 1));
        map2.put("requires_charging", new kqr9a6cdIajJ19jP("requires_charging", "INTEGER", true, 0, null, 1));
        map2.put("requires_device_idle", new kqr9a6cdIajJ19jP("requires_device_idle", "INTEGER", true, 0, null, 1));
        map2.put("requires_battery_not_low", new kqr9a6cdIajJ19jP("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        map2.put("requires_storage_not_low", new kqr9a6cdIajJ19jP("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        map2.put("trigger_content_update_delay", new kqr9a6cdIajJ19jP("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        map2.put("trigger_max_content_delay", new kqr9a6cdIajJ19jP("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        map2.put("content_uri_triggers", new kqr9a6cdIajJ19jP("content_uri_triggers", "BLOB", true, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new TrEY4Uc0Kd3sdQC("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new TrEY4Uc0Kd3sdQC("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        AfMRrsvrH15XfvJ2iD2 afMRrsvrH15XfvJ2iD3 = new AfMRrsvrH15XfvJ2iD2("WorkSpec", map2, hashSet3, hashSet4);
        AfMRrsvrH15XfvJ2iD2 afMRrsvrH15XfvJ2iD2DDIMxZXP1V8HdM2 = AfMRrsvrH15XfvJ2iD2.dDIMxZXP1V8HdM(eyije75asyarhghdxkfx, "WorkSpec");
        if (!afMRrsvrH15XfvJ2iD3.equals(afMRrsvrH15XfvJ2iD2DDIMxZXP1V8HdM2)) {
            return new WO16ah7oTpx6o3e3a(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + afMRrsvrH15XfvJ2iD3 + "\n Found:\n" + afMRrsvrH15XfvJ2iD2DDIMxZXP1V8HdM2);
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new kqr9a6cdIajJ19jP("tag", "TEXT", true, 1, null, 1));
        map3.put("work_spec_id", new kqr9a6cdIajJ19jP("work_spec_id", "TEXT", true, 2, null, 1));
        ?? r7 = (-22) + 23;
        HashSet hashSet5 = new HashSet((int) r7);
        hashSet5.add(new aiWeEbZVIIpMHm("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet((int) r7);
        hashSet6.add(new TrEY4Uc0Kd3sdQC("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        AfMRrsvrH15XfvJ2iD2 afMRrsvrH15XfvJ2iD4 = new AfMRrsvrH15XfvJ2iD2("WorkTag", map3, hashSet5, hashSet6);
        AfMRrsvrH15XfvJ2iD2 afMRrsvrH15XfvJ2iD2DDIMxZXP1V8HdM3 = AfMRrsvrH15XfvJ2iD2.dDIMxZXP1V8HdM(eyije75asyarhghdxkfx, "WorkTag");
        if (!afMRrsvrH15XfvJ2iD4.equals(afMRrsvrH15XfvJ2iD2DDIMxZXP1V8HdM3)) {
            return new WO16ah7oTpx6o3e3a(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + afMRrsvrH15XfvJ2iD4 + "\n Found:\n" + afMRrsvrH15XfvJ2iD2DDIMxZXP1V8HdM3);
        }
        HashMap map4 = new HashMap((-45) + 48);
        map4.put("work_spec_id", new kqr9a6cdIajJ19jP("work_spec_id", "TEXT", true, 1, null, 1));
        map4.put("generation", new kqr9a6cdIajJ19jP("generation", "INTEGER", true, 2, "0", 1));
        map4.put("system_id", new kqr9a6cdIajJ19jP("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet((int) r7);
        hashSet7.add(new aiWeEbZVIIpMHm("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        AfMRrsvrH15XfvJ2iD2 afMRrsvrH15XfvJ2iD5 = new AfMRrsvrH15XfvJ2iD2("SystemIdInfo", map4, hashSet7, new HashSet(0));
        AfMRrsvrH15XfvJ2iD2 afMRrsvrH15XfvJ2iD2DDIMxZXP1V8HdM4 = AfMRrsvrH15XfvJ2iD2.dDIMxZXP1V8HdM(eyije75asyarhghdxkfx, "SystemIdInfo");
        if (!afMRrsvrH15XfvJ2iD5.equals(afMRrsvrH15XfvJ2iD2DDIMxZXP1V8HdM4)) {
            return new WO16ah7oTpx6o3e3a(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + afMRrsvrH15XfvJ2iD5 + "\n Found:\n" + afMRrsvrH15XfvJ2iD2DDIMxZXP1V8HdM4);
        }
        HashMap map5 = new HashMap(2);
        map5.put("name", new kqr9a6cdIajJ19jP("name", "TEXT", true, 1, null, 1));
        map5.put("work_spec_id", new kqr9a6cdIajJ19jP("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet((int) r7);
        hashSet8.add(new aiWeEbZVIIpMHm("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet((int) r7);
        hashSet9.add(new TrEY4Uc0Kd3sdQC("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        AfMRrsvrH15XfvJ2iD2 afMRrsvrH15XfvJ2iD6 = new AfMRrsvrH15XfvJ2iD2("WorkName", map5, hashSet8, hashSet9);
        AfMRrsvrH15XfvJ2iD2 afMRrsvrH15XfvJ2iD2DDIMxZXP1V8HdM5 = AfMRrsvrH15XfvJ2iD2.dDIMxZXP1V8HdM(eyije75asyarhghdxkfx, "WorkName");
        if (!afMRrsvrH15XfvJ2iD6.equals(afMRrsvrH15XfvJ2iD2DDIMxZXP1V8HdM5)) {
            return new WO16ah7oTpx6o3e3a(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + afMRrsvrH15XfvJ2iD6 + "\n Found:\n" + afMRrsvrH15XfvJ2iD2DDIMxZXP1V8HdM5);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new kqr9a6cdIajJ19jP("work_spec_id", "TEXT", true, 1, null, 1));
        map6.put("progress", new kqr9a6cdIajJ19jP("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet((int) r7);
        hashSet10.add(new aiWeEbZVIIpMHm("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        AfMRrsvrH15XfvJ2iD2 afMRrsvrH15XfvJ2iD7 = new AfMRrsvrH15XfvJ2iD2("WorkProgress", map6, hashSet10, new HashSet(0));
        AfMRrsvrH15XfvJ2iD2 afMRrsvrH15XfvJ2iD2DDIMxZXP1V8HdM6 = AfMRrsvrH15XfvJ2iD2.dDIMxZXP1V8HdM(eyije75asyarhghdxkfx, "WorkProgress");
        if (!afMRrsvrH15XfvJ2iD7.equals(afMRrsvrH15XfvJ2iD2DDIMxZXP1V8HdM6)) {
            return new WO16ah7oTpx6o3e3a(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + afMRrsvrH15XfvJ2iD7 + "\n Found:\n" + afMRrsvrH15XfvJ2iD2DDIMxZXP1V8HdM6);
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new kqr9a6cdIajJ19jP("key", "TEXT", true, 1, null, 1));
        map7.put("long_value", new kqr9a6cdIajJ19jP("long_value", "INTEGER", false, 0, null, 1));
        AfMRrsvrH15XfvJ2iD2 afMRrsvrH15XfvJ2iD8 = new AfMRrsvrH15XfvJ2iD2("Preference", map7, new HashSet(0), new HashSet(0));
        AfMRrsvrH15XfvJ2iD2 afMRrsvrH15XfvJ2iD2DDIMxZXP1V8HdM7 = AfMRrsvrH15XfvJ2iD2.dDIMxZXP1V8HdM(eyije75asyarhghdxkfx, "Preference");
        if (afMRrsvrH15XfvJ2iD8.equals(afMRrsvrH15XfvJ2iD2DDIMxZXP1V8HdM7)) {
            return new WO16ah7oTpx6o3e3a((boolean) r7, (String) null);
        }
        return new WO16ah7oTpx6o3e3a(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + afMRrsvrH15XfvJ2iD8 + "\n Found:\n" + afMRrsvrH15XfvJ2iD2DDIMxZXP1V8HdM7);
    }

    public void DVTNwpDEVsUKuznof(int i, Object obj) {
        if (i == 42 - 36 || i == 11 - 4 || i == 8) {
        }
        ((ProfileInstallReceiver) this.vekpFI4d1Nc4fakF).setResultCode(i);
    }

    public void EWUjsTERgdPbSw3NNlN(String str) {
        ArrayList arrayList = (ArrayList) this.vekpFI4d1Nc4fakF;
        int i = 0;
        while (i < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    @Override // v.s.EedOwBpLU616tq0s0D
    public void Ee8d2j4S9Vm5yGuR(Object obj) {
        ((CountDownLatch) this.vekpFI4d1Nc4fakF).countDown();
    }

    public void H9XlUr4OeMJFiXK() {
        ((P3NzOtJRLIgJpXupQRO6) this.vekpFI4d1Nc4fakF).b1EoSIRjJHO5.RajVDAY50epkNP();
    }

    public String J0zjQ7CAgohuxU20eCW6(String str) {
        Bundle bundle = (Bundle) this.vekpFI4d1Nc4fakF;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public boolean JXn4Qf7zpnLjP5(sFdNPiaH9eT4T sfdnpiah9et4t) {
        List list = (List) this.vekpFI4d1Nc4fakF;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            pf6EfGexAWq4v pf6efgexawq4v = (pf6EfGexAWq4v) obj;
            if (pf6efgexawq4v.w9sT1Swbhx3hs(sfdnpiah9et4t) && pf6efgexawq4v.vekpFI4d1Nc4fakF(pf6efgexawq4v.dDIMxZXP1V8HdM.dDIMxZXP1V8HdM())) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
            int i = hYpmJoivns3nhcS6.dDIMxZXP1V8HdM;
            imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList, null, ofxQWGnngPxGI3OtvQn.J0zjQ7CAgohuxU20eCW6, 31);
            feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
        }
        return arrayList.isEmpty();
    }

    public Bundle K7eEOBPYP9VIoHWTe() {
        Bundle bundle = (Bundle) this.vekpFI4d1Nc4fakF;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public long[] MLSIo1htfMPWeB8V876L() {
        JSONArray jSONArrayGmNWMfvn6zlEj = gmNWMfvn6zlEj("gcm.n.vibrate_timings");
        if (jSONArrayGmNWMfvn6zlEj == null) {
            return null;
        }
        try {
            if (jSONArrayGmNWMfvn6zlEj.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayGmNWMfvn6zlEj.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArrayGmNWMfvn6zlEj.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            jSONArrayGmNWMfvn6zlEj.toString();
            return null;
        }
    }

    public String Qrz92kRPw4GcghAc(String str) {
        return J0zjQ7CAgohuxU20eCW6(str.concat("_loc_key"));
    }

    @Override // v.s.CkyOmAcgdfoXSc
    public void dDIMxZXP1V8HdM() {
        ((CountDownLatch) this.vekpFI4d1Nc4fakF).countDown();
    }

    public void dTS0S7eC32ubQH54j36(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            HashMap map2 = (HashMap) this.vekpFI4d1Nc4fakF;
            if (value == null) {
                map2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    map2.put(str, value);
                } else {
                    int i = 0;
                    if (cls == boolean[].class) {
                        boolean[] zArr = (boolean[]) value;
                        MnLRqMow83uotly4qYT mnLRqMow83uotly4qYT = MnLRqMow83uotly4qYT.w9sT1Swbhx3hs;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i < zArr.length) {
                            boolArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                        map2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        MnLRqMow83uotly4qYT mnLRqMow83uotly4qYT2 = MnLRqMow83uotly4qYT.w9sT1Swbhx3hs;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i < bArr.length) {
                            bArr2[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                        map2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        MnLRqMow83uotly4qYT mnLRqMow83uotly4qYT3 = MnLRqMow83uotly4qYT.w9sT1Swbhx3hs;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i < iArr.length) {
                            numArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                        map2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        MnLRqMow83uotly4qYT mnLRqMow83uotly4qYT4 = MnLRqMow83uotly4qYT.w9sT1Swbhx3hs;
                        Long[] lArr = new Long[jArr.length];
                        while (i < jArr.length) {
                            lArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                        map2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        MnLRqMow83uotly4qYT mnLRqMow83uotly4qYT5 = MnLRqMow83uotly4qYT.w9sT1Swbhx3hs;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i < fArr.length) {
                            fArr2[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                        map2.put(str, fArr2);
                    } else {
                        if (cls != double[].class) {
                            throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
                        }
                        double[] dArr = (double[]) value;
                        MnLRqMow83uotly4qYT mnLRqMow83uotly4qYT6 = MnLRqMow83uotly4qYT.w9sT1Swbhx3hs;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i < dArr.length) {
                            dArr2[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                        map2.put(str, dArr2);
                    }
                }
            }
        }
    }

    public int[] gIIiyi2ddlMDR0() {
        JSONArray jSONArrayGmNWMfvn6zlEj = gmNWMfvn6zlEj("gcm.n.light_settings");
        if (jSONArrayGmNWMfvn6zlEj == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayGmNWMfvn6zlEj.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayGmNWMfvn6zlEj.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayGmNWMfvn6zlEj.optInt(1);
            iArr[2] = jSONArrayGmNWMfvn6zlEj.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e) {
            jSONArrayGmNWMfvn6zlEj.toString();
            e.getMessage();
            return null;
        } catch (JSONException unused) {
            jSONArrayGmNWMfvn6zlEj.toString();
            return null;
        }
    }

    @Override // v.s.RZKLDkRu6ZWDxTDL71X
    public Object get() {
        switch (this.w9sT1Swbhx3hs) {
            case 4:
                return new eTeIZwLyooQrZ0ICI9i((Context) ((r5XEUfod5GSCCwq6c) this.vekpFI4d1Nc4fakF).vekpFI4d1Nc4fakF, new fEyMFFyOOvHURJ7To6L(18), new fadfsJa4iEdiwEC4Xm8(17));
            default:
                return this.vekpFI4d1Nc4fakF;
        }
    }

    public JSONArray gmNWMfvn6zlEj(String str) {
        String strJ0zjQ7CAgohuxU20eCW6 = J0zjQ7CAgohuxU20eCW6(str);
        if (TextUtils.isEmpty(strJ0zjQ7CAgohuxU20eCW6)) {
            return null;
        }
        try {
            return new JSONArray(strJ0zjQ7CAgohuxU20eCW6);
        } catch (JSONException unused) {
            O2DHNSIGZlgPja7eqLgn(str);
            return null;
        }
    }

    public Integer hjneShqpF9Tis4(String str) {
        String strJ0zjQ7CAgohuxU20eCW6 = J0zjQ7CAgohuxU20eCW6(str);
        if (TextUtils.isEmpty(strJ0zjQ7CAgohuxU20eCW6)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strJ0zjQ7CAgohuxU20eCW6));
        } catch (NumberFormatException unused) {
            O2DHNSIGZlgPja7eqLgn(str);
            return null;
        }
    }

    public SzicGcOQovJ1JhxwfLo8 ibVTtJUNfrGYbW() {
        return new SzicGcOQovJ1JhxwfLo8((String[]) ((ArrayList) this.vekpFI4d1Nc4fakF).toArray(new String[0]));
    }

    public String nQilHWaqS401ZtR(Resources resources, String str, String str2) {
        String strJ0zjQ7CAgohuxU20eCW6 = J0zjQ7CAgohuxU20eCW6(str2);
        if (!TextUtils.isEmpty(strJ0zjQ7CAgohuxU20eCW6)) {
            return strJ0zjQ7CAgohuxU20eCW6;
        }
        String strQrz92kRPw4GcghAc = Qrz92kRPw4GcghAc(str2);
        if (TextUtils.isEmpty(strQrz92kRPw4GcghAc)) {
            return null;
        }
        int identifier = resources.getIdentifier(strQrz92kRPw4GcghAc, "string", str);
        if (identifier == 0) {
            O2DHNSIGZlgPja7eqLgn(str2.concat("_loc_key"));
            return null;
        }
        Object[] objArrWotphlvK9sPbXJ = wotphlvK9sPbXJ(str2);
        if (objArrWotphlvK9sPbXJ == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrWotphlvK9sPbXJ);
        } catch (MissingFormatArgumentException unused) {
            O2DHNSIGZlgPja7eqLgn(str2);
            Arrays.toString(objArrWotphlvK9sPbXJ);
            return null;
        }
    }

    public boolean pyu8ovAipBTLYAiKab(String str) {
        String strJ0zjQ7CAgohuxU20eCW6 = J0zjQ7CAgohuxU20eCW6(str);
        return "1".equals(strJ0zjQ7CAgohuxU20eCW6) || Boolean.parseBoolean(strJ0zjQ7CAgohuxU20eCW6);
    }

    public void rCHnHJBAlOpNI5(Context context, ServiceConnection serviceConnection) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.vekpFI4d1Nc4fakF;
        if ((serviceConnection instanceof zOrvdeexKSd0Bj) || !concurrentHashMap.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                concurrentHashMap.remove(serviceConnection);
            }
        }
    }

    public void vIJudZvPyTuNp(Exception exc) {
        agyaknTU4kgQn agyakntu4kgqn = (agyaknTU4kgQn) this.vekpFI4d1Nc4fakF;
        if (O2DHNSIGZlgPja7eqLgn.ibVTtJUNfrGYbW.JXn4Qf7zpnLjP5(agyakntu4kgqn, null, new dTS0S7eC32ubQH54j36(exc))) {
            O2DHNSIGZlgPja7eqLgn.JXn4Qf7zpnLjP5(agyakntu4kgqn);
        }
    }

    @Override // v.s.qEQ5trexEd2Ykvd
    public void vekpFI4d1Nc4fakF(Exception exc) {
        ((CountDownLatch) this.vekpFI4d1Nc4fakF).countDown();
    }

    public void w9sT1Swbhx3hs(G3FkI4yU8rMPR... g3FkI4yU8rMPRArr) {
        for (G3FkI4yU8rMPR g3FkI4yU8rMPR : g3FkI4yU8rMPRArr) {
            int i = g3FkI4yU8rMPR.dDIMxZXP1V8HdM;
            int i2 = g3FkI4yU8rMPR.w9sT1Swbhx3hs;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.vekpFI4d1Nc4fakF;
            Integer numValueOf = Integer.valueOf(i);
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i2))) {
                Objects.toString(treeMap2.get(Integer.valueOf(i2)));
                g3FkI4yU8rMPR.toString();
            }
            treeMap2.put(Integer.valueOf(i2), g3FkI4yU8rMPR);
        }
    }

    public Object[] wotphlvK9sPbXJ(String str) {
        JSONArray jSONArrayGmNWMfvn6zlEj = gmNWMfvn6zlEj(str.concat("_loc_args"));
        if (jSONArrayGmNWMfvn6zlEj == null) {
            return null;
        }
        int length = jSONArrayGmNWMfvn6zlEj.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArrayGmNWMfvn6zlEj.optString(i);
        }
        return strArr;
    }

    @Override // v.s.hYMmDgRUK0a6MaJzT
    public void xDyLpEZyrcKVe0(DfUmSWZwfhCUz dfUmSWZwfhCUz) {
        Exception excVekpFI4d1Nc4fakF = dfUmSWZwfhCUz.vekpFI4d1Nc4fakF();
        if (excVekpFI4d1Nc4fakF != null) {
            ((hD886kxBkce8U) this.vekpFI4d1Nc4fakF).ibVTtJUNfrGYbW(new VSZeS5mia3yEXbAe(excVekpFI4d1Nc4fakF));
        } else if (((SQzPENpgvzKX9IlD) dfUmSWZwfhCUz).JXn4Qf7zpnLjP5) {
            ((hD886kxBkce8U) this.vekpFI4d1Nc4fakF).wotphlvK9sPbXJ(null);
        } else {
            ((hD886kxBkce8U) this.vekpFI4d1Nc4fakF).ibVTtJUNfrGYbW(dfUmSWZwfhCUz.JXn4Qf7zpnLjP5());
        }
    }

    public boolean xfn2GJwmGqs7kWW(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.vekpFI4d1Nc4fakF;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((I5wRTRZp0psyO1L.dDIMxZXP1V8HdM(context).dDIMxZXP1V8HdM.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof zOrvdeexKSd0Bj) {
            return context.bindService(intent, serviceConnection, i);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction());
        }
        try {
            boolean zBindService = context.bindService(intent, serviceConnection, i);
            if (zBindService) {
                return zBindService;
            }
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }

    public void yTljMGnIibTRdOpSh4(String str, String str2) {
        FZ1sl4mHq4J0hOEYC.ibVTtJUNfrGYbW(str);
        FZ1sl4mHq4J0hOEYC.b1EoSIRjJHO5(str2, str);
        EWUjsTERgdPbSw3NNlN(str);
        ArrayList arrayList = (ArrayList) this.vekpFI4d1Nc4fakF;
        arrayList.add(str);
        arrayList.add(KgSM0TsKUpCiuePB.uW0IRoPBZMj2QmBkkp(str2).toString());
    }

    public /* synthetic */ r5XEUfod5GSCCwq6c(int i, boolean z) {
        this.w9sT1Swbhx3hs = i;
    }

    public r5XEUfod5GSCCwq6c(int i) {
        Handler handler;
        Handler handlerW9sT1Swbhx3hs;
        this.w9sT1Swbhx3hs = i;
        switch (i) {
            case 3:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                this.vekpFI4d1Nc4fakF = new AW3ZFVDOCYNQG2ry0h(Cid8LKolL4e2FdtXe.pyu8ovAipBTLYAiKab);
                return;
            case 5:
                this.vekpFI4d1Nc4fakF = new HashMap();
                return;
            case 6:
                Looper mainLooper = Looper.getMainLooper();
                if (Build.VERSION.SDK_INT >= 28) {
                    handlerW9sT1Swbhx3hs = wPKkuB5tXUtJnC.w9sT1Swbhx3hs(mainLooper);
                } else {
                    try {
                        handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                    } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
                        handler = new Handler(mainLooper);
                    } catch (InvocationTargetException e) {
                        Throwable cause = e.getCause();
                        if (!(cause instanceof RuntimeException)) {
                            if (cause instanceof Error) {
                                throw ((Error) cause);
                            }
                            throw new RuntimeException(cause);
                        }
                        throw ((RuntimeException) cause);
                    }
                    handlerW9sT1Swbhx3hs = handler;
                    break;
                }
                this.vekpFI4d1Nc4fakF = handlerW9sT1Swbhx3hs;
                return;
            case 10:
                this.vekpFI4d1Nc4fakF = null;
                return;
            case 11:
                this.vekpFI4d1Nc4fakF = new ArrayList(20);
                return;
            case 17:
                this.vekpFI4d1Nc4fakF = new LinkedHashMap();
                return;
            case 18:
                this.vekpFI4d1Nc4fakF = new LinkedHashSet();
                return;
            case 28:
                this.vekpFI4d1Nc4fakF = new CountDownLatch(1);
                return;
            default:
                this.vekpFI4d1Nc4fakF = new HashSet();
                return;
        }
    }

    public r5XEUfod5GSCCwq6c(Bundle bundle) {
        this.w9sT1Swbhx3hs = 15;
        if (bundle != null) {
            this.vekpFI4d1Nc4fakF = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    public r5XEUfod5GSCCwq6c(hzCVl0f866ksvpzUUql hzcvl0f866ksvpzuuql) {
        this.w9sT1Swbhx3hs = 14;
        this.vekpFI4d1Nc4fakF = new CopyOnWriteArrayList();
        new HashMap();
    }

    public r5XEUfod5GSCCwq6c(mYrXZiFjFW2Xg myrxzifjfw2xg) {
        this.w9sT1Swbhx3hs = 22;
        kb5cLhNKzocCCzGJZQS kb5clhnkzoccczgjzqs = new kb5cLhNKzocCCzGJZQS((lnZAzok3Cgjp5b) myrxzifjfw2xg.w9sT1Swbhx3hs, 0);
        kb5cLhNKzocCCzGJZQS kb5clhnkzoccczgjzqs2 = new kb5cLhNKzocCCzGJZQS((lnZAzok3Cgjp5b) myrxzifjfw2xg.vekpFI4d1Nc4fakF, 1);
        kb5cLhNKzocCCzGJZQS kb5clhnkzoccczgjzqs3 = new kb5cLhNKzocCCzGJZQS((lnZAzok3Cgjp5b) myrxzifjfw2xg.Ee8d2j4S9Vm5yGuR, 4);
        GHV5q6ADozYUUx gHV5q6ADozYUUx = (GHV5q6ADozYUUx) myrxzifjfw2xg.JXn4Qf7zpnLjP5;
        this.vekpFI4d1Nc4fakF = Aqh0grSwgDbwr.yTljMGnIibTRdOpSh4(kb5clhnkzoccczgjzqs, kb5clhnkzoccczgjzqs2, kb5clhnkzoccczgjzqs3, new kb5cLhNKzocCCzGJZQS(gHV5q6ADozYUUx, 2), new kb5cLhNKzocCCzGJZQS(gHV5q6ADozYUUx, 3), new vK6q9wQCMWFlv2n7(gHV5q6ADozYUUx), new FxfgQBMjENjFskbH(gHV5q6ADozYUUx));
    }

    public r5XEUfod5GSCCwq6c(Daw7QaVwgN3e6 daw7QaVwgN3e6) {
        this.w9sT1Swbhx3hs = 20;
        this.vekpFI4d1Nc4fakF = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), daw7QaVwgN3e6);
    }
}
