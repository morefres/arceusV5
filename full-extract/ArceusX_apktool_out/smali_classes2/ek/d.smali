.class public Lek/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;)V
    .locals 4

    new-instance v0, Lqm/c$a;

    sget-object v1, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->EVENT_INGEST:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    sget-object v2, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->POINTS:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    invoke-static {v1, v2}, Lyj/l0;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    const-string v2, "JavaAssetReadEvent"

    invoke-direct {v0, v2, v1}, Lqm/c$a;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    const/16 v1, 0xa

    const/16 v2, 0x17

    const/16 v3, 0x7e9

    invoke-virtual {v0, v3, v1, v2}, Lqm/c$a;->j(III)Lqm/c$a;

    move-result-object v0

    const-string v1, "New JavaAssetReadEvent"

    invoke-virtual {v0, v1}, Lqm/c$a;->i(Ljava/lang/String;)Lqm/c$a;

    move-result-object v0

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v1

    invoke-interface {v1}, Lrh/i;->Z()I

    move-result v1

    invoke-virtual {v0, v1}, Lqm/c$a;->k(I)Lqm/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lqm/c$a;->d()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    new-instance v1, Lqm/c$b;

    invoke-direct {v1}, Lqm/c$b;-><init>()V

    const-string v2, "assetPathRaw"

    invoke-virtual {v1, v2, p0}, Lqm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lqm/c$b;

    move-result-object p0

    sget-object v1, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_OS_INFO:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    invoke-virtual {p0, v1}, Lqm/c$b;->j(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;)Lqm/c$b;

    move-result-object p0

    invoke-virtual {p0}, Lqm/c$b;->l()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;

    move-result-object p0

    invoke-static {v0, p0}, Lqm/c;->h(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;)Z

    return-void
.end method
