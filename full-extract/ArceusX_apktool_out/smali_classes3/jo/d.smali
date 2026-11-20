.class public final synthetic Ljo/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lwm/k$a;


# direct methods
.method public synthetic constructor <init>(Lwm/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljo/d;->a:Lwm/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ljo/d;->a:Lwm/k$a;

    check-cast p1, Lcn/e$b;

    invoke-static {v0, p1}, Ljo/t0;->N(Lwm/k$a;Lcn/e$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
