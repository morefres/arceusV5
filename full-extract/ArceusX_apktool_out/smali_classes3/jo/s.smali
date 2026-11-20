.class public final synthetic Ljo/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lwm/k$a;

.field public final synthetic b:Lso/l;


# direct methods
.method public synthetic constructor <init>(Lwm/k$a;Lso/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljo/s;->a:Lwm/k$a;

    iput-object p2, p0, Ljo/s;->b:Lso/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ljo/s;->a:Lwm/k$a;

    iget-object v1, p0, Ljo/s;->b:Lso/l;

    invoke-static {v0, v1}, Ljo/t0;->c(Lwm/k$a;Lso/l;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
