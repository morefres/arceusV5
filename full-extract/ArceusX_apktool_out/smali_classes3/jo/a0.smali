.class public final synthetic Ljo/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lsr/a;

.field public final synthetic b:Ljo/t0;

.field public final synthetic c:Lfn/k0;

.field public final synthetic d:Lrr/b$b;

.field public final synthetic e:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

.field public final synthetic f:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

.field public final synthetic g:Lwm/k$a;


# direct methods
.method public synthetic constructor <init>(Lsr/a;Ljo/t0;Lfn/k0;Lrr/b$b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lwm/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljo/a0;->a:Lsr/a;

    iput-object p2, p0, Ljo/a0;->b:Ljo/t0;

    iput-object p3, p0, Ljo/a0;->c:Lfn/k0;

    iput-object p4, p0, Ljo/a0;->d:Lrr/b$b;

    iput-object p5, p0, Ljo/a0;->e:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iput-object p6, p0, Ljo/a0;->f:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iput-object p7, p0, Ljo/a0;->g:Lwm/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Ljo/a0;->a:Lsr/a;

    iget-object v1, p0, Ljo/a0;->b:Ljo/t0;

    iget-object v2, p0, Ljo/a0;->c:Lfn/k0;

    iget-object v3, p0, Ljo/a0;->d:Lrr/b$b;

    iget-object v4, p0, Ljo/a0;->e:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iget-object v5, p0, Ljo/a0;->f:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iget-object v6, p0, Ljo/a0;->g:Lwm/k$a;

    move-object v7, p1

    check-cast v7, Lwm/r$c;

    invoke-static/range {v0 .. v7}, Ljo/t0;->H(Lsr/a;Ljo/t0;Lfn/k0;Lrr/b$b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lwm/k$a;Lwm/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
