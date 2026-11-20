.class public final synthetic Ljo/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljo/t0;

.field public final synthetic b:Lsr/a;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

.field public final synthetic e:Lwm/k$a;


# direct methods
.method public synthetic constructor <init>(Ljo/t0;Lsr/a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lwm/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljo/k;->a:Ljo/t0;

    iput-object p2, p0, Ljo/k;->b:Lsr/a;

    iput-object p3, p0, Ljo/k;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iput-object p4, p0, Ljo/k;->d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iput-object p5, p0, Ljo/k;->e:Lwm/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Ljo/k;->a:Ljo/t0;

    iget-object v1, p0, Ljo/k;->b:Lsr/a;

    iget-object v2, p0, Ljo/k;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iget-object v3, p0, Ljo/k;->d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iget-object v4, p0, Ljo/k;->e:Lwm/k$a;

    move-object v5, p1

    check-cast v5, Lrr/b$b;

    invoke-static/range {v0 .. v5}, Ljo/t0;->i(Ljo/t0;Lsr/a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lwm/k$a;Lrr/b$b;)Lwm/r;

    move-result-object p1

    return-object p1
.end method
