.class public final synthetic Luq/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyt/o;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Luq/m;

    check-cast p2, Lym/y;

    check-cast p3, Landroid/content/Context;

    check-cast p4, Landroid/view/ViewGroup;

    invoke-static {p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$a;->b(Luq/m;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
