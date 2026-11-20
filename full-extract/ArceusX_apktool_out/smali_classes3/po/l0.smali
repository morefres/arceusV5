.class public final synthetic Lpo/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lpo/m0;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

.field public final synthetic c:Ltr/f;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

.field public final synthetic e:Lwm/h;


# direct methods
.method public synthetic constructor <init>(Lpo/m0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Ltr/f;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lwm/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpo/l0;->a:Lpo/m0;

    iput-object p2, p0, Lpo/l0;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iput-object p3, p0, Lpo/l0;->c:Ltr/f;

    iput-object p4, p0, Lpo/l0;->d:Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    iput-object p5, p0, Lpo/l0;->e:Lwm/h;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lpo/l0;->a:Lpo/m0;

    iget-object v1, p0, Lpo/l0;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iget-object v2, p0, Lpo/l0;->c:Ltr/f;

    iget-object v3, p0, Lpo/l0;->d:Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    iget-object v4, p0, Lpo/l0;->e:Lwm/h;

    move-object v5, p1

    check-cast v5, Lgt/n;

    invoke-static/range {v0 .. v5}, Lpo/m0;->f(Lpo/m0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Ltr/f;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lwm/h;Lgt/n;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
