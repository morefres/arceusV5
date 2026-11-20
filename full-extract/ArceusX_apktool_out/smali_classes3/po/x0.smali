.class public final synthetic Lpo/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lpo/j1;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

.field public final synthetic c:Lsr/a;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;

.field public final synthetic e:Ltr/f;

.field public final synthetic f:Lso/l;


# direct methods
.method public synthetic constructor <init>(Lpo/j1;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lsr/a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;Ltr/f;Lso/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpo/x0;->a:Lpo/j1;

    iput-object p2, p0, Lpo/x0;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iput-object p3, p0, Lpo/x0;->c:Lsr/a;

    iput-object p4, p0, Lpo/x0;->d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;

    iput-object p5, p0, Lpo/x0;->e:Ltr/f;

    iput-object p6, p0, Lpo/x0;->f:Lso/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lpo/x0;->a:Lpo/j1;

    iget-object v1, p0, Lpo/x0;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iget-object v2, p0, Lpo/x0;->c:Lsr/a;

    iget-object v3, p0, Lpo/x0;->d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;

    iget-object v4, p0, Lpo/x0;->e:Ltr/f;

    iget-object v5, p0, Lpo/x0;->f:Lso/l;

    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    invoke-static/range {v0 .. v6}, Lpo/j1;->l(Lpo/j1;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lsr/a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;Ltr/f;Lso/l;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
