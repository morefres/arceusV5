.class public final synthetic Lgo/t2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;

.field public final synthetic b:Lwm/k$a;

.field public final synthetic c:Lso/l;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;Lwm/k$a;Lso/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgo/t2;->a:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;

    iput-object p2, p0, Lgo/t2;->b:Lwm/k$a;

    iput-object p3, p0, Lgo/t2;->c:Lso/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lgo/t2;->a:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;

    iget-object v1, p0, Lgo/t2;->b:Lwm/k$a;

    iget-object v2, p0, Lgo/t2;->c:Lso/l;

    check-cast p1, Lwm/r$c;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/p;->e(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;Lwm/k$a;Lso/l;Lwm/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
