.class public final synthetic Ljo/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ljo/t0;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

.field public final synthetic c:Lwm/k$a;


# direct methods
.method public synthetic constructor <init>(Ljo/t0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lwm/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljo/i;->a:Ljo/t0;

    iput-object p2, p0, Ljo/i;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iput-object p3, p0, Ljo/i;->c:Lwm/k$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ljo/i;->a:Ljo/t0;

    iget-object v1, p0, Ljo/i;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iget-object v2, p0, Ljo/i;->c:Lwm/k$a;

    invoke-static {v0, v1, v2}, Ljo/t0;->P(Ljo/t0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lwm/k$a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
