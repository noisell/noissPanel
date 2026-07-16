package v.s;

import android.content.ContentValues;
import android.text.TextUtils;
import androidx.work.OverwritingInputMerger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class tkTEvUX7a8z4uCBlH0D extends G3FkI4yU8rMPR {
    public final /* synthetic */ int vekpFI4d1Nc4fakF;
    public static final tkTEvUX7a8z4uCBlH0D JXn4Qf7zpnLjP5 = new tkTEvUX7a8z4uCBlH0D(11, 12, 0);
    public static final tkTEvUX7a8z4uCBlH0D Ee8d2j4S9Vm5yGuR = new tkTEvUX7a8z4uCBlH0D(12, 13, 1);
    public static final tkTEvUX7a8z4uCBlH0D xDyLpEZyrcKVe0 = new tkTEvUX7a8z4uCBlH0D(15, 16, 2);
    public static final tkTEvUX7a8z4uCBlH0D ibVTtJUNfrGYbW = new tkTEvUX7a8z4uCBlH0D(16, 17, 3);
    public static final tkTEvUX7a8z4uCBlH0D b1EoSIRjJHO5 = new tkTEvUX7a8z4uCBlH0D(1, 2, 4);
    public static final tkTEvUX7a8z4uCBlH0D pyu8ovAipBTLYAiKab = new tkTEvUX7a8z4uCBlH0D(3, 4, 5);
    public static final tkTEvUX7a8z4uCBlH0D D5P1xCAyuvgF = new tkTEvUX7a8z4uCBlH0D(4, 5, 6);
    public static final tkTEvUX7a8z4uCBlH0D hjneShqpF9Tis4 = new tkTEvUX7a8z4uCBlH0D(6, 7, 7);
    public static final tkTEvUX7a8z4uCBlH0D gmNWMfvn6zlEj = new tkTEvUX7a8z4uCBlH0D(7, 8, 8);
    public static final tkTEvUX7a8z4uCBlH0D gIIiyi2ddlMDR0 = new tkTEvUX7a8z4uCBlH0D(8, 9, 9);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tkTEvUX7a8z4uCBlH0D(int i, int i2, int i3) {
        super(i, i2);
        this.vekpFI4d1Nc4fakF = i3;
    }

    @Override // v.s.G3FkI4yU8rMPR
    public final void dDIMxZXP1V8HdM(eyije75asyarHGHdxkfX eyije75asyarhghdxkfx) {
        Comparable comparable;
        String strSubstring;
        switch (this.vekpFI4d1Nc4fakF) {
            case 0:
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
                return;
            case 1:
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
                return;
            case 2:
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("DROP TABLE `SystemIdInfo`");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
                return;
            case 3:
                String str = "UPDATE WorkSpec\n                SET input_merger_class_name = '" + OverwritingInputMerger.class.getName() + "'\n                WHERE input_merger_class_name IS NULL\n                ";
                List listAjrMZmky8AIb2Pr = KgSM0TsKUpCiuePB.ajrMZmky8AIb2Pr(str);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listAjrMZmky8AIb2Pr) {
                    if (!BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(D8f4u3NB1PCAS427.xfn2GJwmGqs7kWW(arrayList));
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    String str2 = (String) obj2;
                    int length = str2.length();
                    int length2 = 0;
                    while (true) {
                        if (length2 >= length) {
                            length2 = -1;
                        } else if (OFMrQsTe5s1KYV0lq.gIIiyi2ddlMDR0(str2.charAt(length2))) {
                            length2++;
                        }
                    }
                    if (length2 == -1) {
                        length2 = str2.length();
                    }
                    arrayList2.add(Integer.valueOf(length2));
                }
                Iterator it = arrayList2.iterator();
                if (it.hasNext()) {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int iIntValue = num != null ? num.intValue() : 0;
                int length3 = str.length();
                listAjrMZmky8AIb2Pr.size();
                int iEWUjsTERgdPbSw3NNlN = Aqh0grSwgDbwr.EWUjsTERgdPbSw3NNlN(listAjrMZmky8AIb2Pr);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : listAjrMZmky8AIb2Pr) {
                    int i3 = i + 1;
                    if (i < 0) {
                        Aqh0grSwgDbwr.O2DHNSIGZlgPja7eqLgn();
                        throw null;
                    }
                    String str3 = (String) obj3;
                    if ((i == 0 || i == iEWUjsTERgdPbSw3NNlN) && BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(str3)) {
                        strSubstring = null;
                    } else {
                        if (iIntValue < 0) {
                            throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.b1EoSIRjJHO5("Requested character count ", " is less than zero.", iIntValue).toString());
                        }
                        int length4 = str3.length();
                        if (iIntValue <= length4) {
                            length4 = iIntValue;
                        }
                        strSubstring = str3.substring(length4);
                    }
                    if (strSubstring != null) {
                        arrayList3.add(strSubstring);
                    }
                    i = i3;
                }
                StringBuilder sb = new StringBuilder(length3);
                imhBI9RqzETHtVIJe.k84rwRrqzhrNQ1CdNQ9(arrayList3, sb, "\n", "", "", null);
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc(sb.toString());
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (\n                `id` TEXT NOT NULL,\n                `state` INTEGER NOT NULL,\n                `worker_class_name` TEXT NOT NULL,\n                `input_merger_class_name` TEXT NOT NULL,\n                `input` BLOB NOT NULL,\n                `output` BLOB NOT NULL,\n                `initial_delay` INTEGER NOT NULL,\n                `interval_duration` INTEGER NOT NULL,\n                `flex_duration` INTEGER NOT NULL,\n                `run_attempt_count` INTEGER NOT NULL,\n                `backoff_policy` INTEGER NOT NULL,\n                `backoff_delay_duration` INTEGER NOT NULL,\n                `last_enqueue_time` INTEGER NOT NULL,\n                `minimum_retention_duration` INTEGER NOT NULL,\n                `schedule_requested_at` INTEGER NOT NULL,\n                `run_in_foreground` INTEGER NOT NULL,\n                `out_of_quota_policy` INTEGER NOT NULL,\n                `period_count` INTEGER NOT NULL DEFAULT 0,\n                `generation` INTEGER NOT NULL DEFAULT 0,\n                `required_network_type` INTEGER NOT NULL,\n                `requires_charging` INTEGER NOT NULL,\n                `requires_device_idle` INTEGER NOT NULL,\n                `requires_battery_not_low` INTEGER NOT NULL,\n                `requires_storage_not_low` INTEGER NOT NULL,\n                `trigger_content_update_delay` INTEGER NOT NULL,\n                `trigger_max_content_delay` INTEGER NOT NULL,\n                `content_uri_triggers` BLOB NOT NULL,\n                PRIMARY KEY(`id`)\n                )");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("INSERT INTO `_new_WorkSpec` (\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            ) SELECT\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            FROM `WorkSpec`");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("DROP TABLE `WorkSpec`");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at`ON `WorkSpec` (`schedule_requested_at`)");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON`WorkSpec` (`last_enqueue_time`)");
                return;
            case 4:
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("DROP TABLE IF EXISTS alarmInfo");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
                return;
            case 5:
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
                return;
            case 6:
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
                return;
            case 7:
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                return;
            case 8:
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
                return;
            case 9:
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
                return;
            case 10:
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("DROP TABLE `WorkSpec`");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
                return;
            case 11:
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("DROP TABLE `WorkSpec`");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
                Object[] objArr = new Object[0];
                eyije75asyarhghdxkfx.getClass();
                if (contentValues.size() == 0) {
                    throw new IllegalArgumentException("Empty values");
                }
                int size2 = contentValues.size();
                int length5 = objArr.length + size2;
                Object[] objArr2 = new Object[length5];
                StringBuilder sb2 = new StringBuilder("UPDATE ");
                sb2.append(eyije75asyarHGHdxkfX.JXn4Qf7zpnLjP5[(-82) + 85]);
                sb2.append("WorkSpec SET ");
                int i4 = 0;
                for (String str4 : contentValues.keySet()) {
                    sb2.append(i4 > 0 ? "," : "");
                    sb2.append(str4);
                    objArr2[i4] = contentValues.get(str4);
                    sb2.append("=?");
                    i4++;
                }
                for (int i5 = size2; i5 < length5; i5++) {
                    objArr2[i5] = objArr[i5 - size2];
                }
                if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                    sb2.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
                }
                IvGcaSCdlPOakpJ6v ivGcaSCdlPOakpJ6vD5P1xCAyuvgF = eyije75asyarhghdxkfx.D5P1xCAyuvgF(sb2.toString());
                okc5AGRjqrud84oM6d.vekpFI4d1Nc4fakF(ivGcaSCdlPOakpJ6vD5P1xCAyuvgF, objArr2);
                ivGcaSCdlPOakpJ6vD5P1xCAyuvgF.vekpFI4d1Nc4fakF.executeUpdateDelete();
                return;
            case 12:
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("DROP TABLE `WorkSpec`");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                return;
            case 13:
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
                return;
            case 14:
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
                return;
            default:
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("DROP TABLE `WorkSpec`");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkTEvUX7a8z4uCBlH0D(int i) {
        super(14, 15);
        this.vekpFI4d1Nc4fakF = i;
        switch (i) {
            case 15:
                super(19, 20);
                break;
            default:
                break;
        }
    }
}
