.class public final synthetic Lpo/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lpo/m0;

.field public final synthetic b:Ltr/f;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

.field public final synthetic d:Lso/l;


# direct methods
.method public synthetic constructor <init>(Lpo/m0;Ltr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lso/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpo/k0;->a:Lpo/m0;

    iput-object p2, p0, Lpo/k0;->b:Ltr/f;

    iput-object p3, p0, Lpo/k0;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iput-object p4, p0, Lpo/k0;->d:Lso/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lpo/k0;->a:Lpo/m0;

    iget-object v1, p0, Lpo/k0;->b:Ltr/f;

    iget-object v2, p0, Lpo/k0;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iget-object v3, p0, Lpo/k0;->d:Lso/l;

    invoke-static {v0, v1, v2, v3}, Lpo/m0;->e(Lpo/m0;Ltr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lso/l;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
