.class public final synthetic Lgo/v1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lso/l;


# direct methods
.method public synthetic constructor <init>(Lso/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgo/v1;->a:Lso/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lgo/v1;->a:Lso/l;

    check-cast p1, Lwm/r$c;

    invoke-static {v0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->l(Lso/l;Lwm/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
